package UpdateableResultSets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateableResultSetsDemo
{
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:MySQL://localhost:3306/JavaJDBC?useSSL=false";
        String username = "admin";    //For connection we need 'username' and 'password'
        String password = "admin";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        //ResultSet.TYPE_SCROLL_INSENSITIVE ---> The result set is scrollable but not sensitive to database changes
        //ResultSet.CONCUR_UPDATABLE---> The result set can be used to update the database

        String sql = "select * from contacts";
        ResultSet rs = statement.executeQuery(sql);
        if (rs.next())
        {
            String name = rs.getString("name"); //getting name that is in database
            rs.updateString("name", name + " (Modified)"); // adding 'modified' after the original name to see the updated value
            rs.updateRow();
        }
        statement.close();
        connection.close();


    }

}
