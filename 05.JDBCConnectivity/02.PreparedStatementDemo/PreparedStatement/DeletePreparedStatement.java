package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletePreparedStatement
{
    public static void main(String[] args ) throws SQLException
    {
        //***************************************** Establishing Connection to the Database ************************************************

        String url = "jdbc:MySQL://localhost:3306/JavaJDBC?useSSL=false";
        String username = "admin";    //For connection we need 'username' and 'password'
        String password = "admin";

        Connection connection = DriverManager.getConnection(url, username, password);

        // ************* Sql prepared statement *************************
        String sql = "delete from contacts where id= ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        //************* Binding Parameters ***************************
        int id = 1;
        statement.setInt(1, id);

        int rowDeleted = statement.executeUpdate();

        //******************** message for user if rows are  successfully deleted or not ******
        if (rowDeleted > 0)
            System.out.println("Row Deleted Successfully!!");

        else
            System.out.println("Row isn't Deleted!!");

        statement.close();
        connection.close();




    }
}
