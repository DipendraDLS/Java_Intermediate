package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePreparedStatement
{
    public static void main(String[] args) throws SQLException
    {
        //********************************************* Establishing Connection to the Database ************************************************

        String url = "jdbc:MySQL://localhost:3306/JavaJDBC?useSSL=false";
        String username = "admin";
        String password = "admin";

        Connection connection = DriverManager.getConnection(url, username, password);

        //************************ Executing Sql statement **************************
        String sql = "update contacts set name = ?,phone= ? where id= ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        //****************** Binding Parameter ******************************************************
        int id =1;
        String name = "Geeta";
        String phone = "9898989898";

        statement.setString(1,name);
        statement.setString(2,phone);
        statement.setInt(3,id);


        int rowUpdated = statement.executeUpdate();

        //******************** message for user if rows are  successfully updated or not **********
        if (rowUpdated > 0)
            System.out.println("Row updated Successfully!!");

        else
            System.out.println("Row isn't Updated!!");

        statement.close(); //statement has to be close.
        connection.close();

    }
}
