package ScrollableResultSets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableResultsetsDemo
{
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:MySQL://localhost:3306/JavaJDBC?useSSL=false";
        String username = "admin";    //For connection we need 'username' and 'password'
        String password = "admin";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                                                         //ResultSet.TYPE_SCROLL_INSENSITIVE ---> The result set is scrollable but not sensitive to database changes
                                                         //ResultSet.CONCUR_READ_ONLY---> The result set cannot be used to update the database (default)

        String sql = "select * from contacts";
        ResultSet rs = statement.executeQuery(sql);
        System.out.println("RECORDS IN THE TABLE...");

        while (rs.next())
        {
            System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+" "+ rs.getString(3));
        }
        //Move to first row
        rs.first();
        System.out.println("FIRST RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2) +" "+ rs.getString(3));

        //Move to specific row
        rs.absolute(3);
        System.out.println("THIRD RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+" "+ rs.getString(3));

        //Move to last row
        rs.last();
        System.out.println("LAST RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+" "+ rs.getString(3));

        //Move to previous record
        rs.previous();
        System.out.println("PREVIOUS RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+" "+ rs.getString(3));

        //Move backward/forward by n rows from current position (use -ve value to move backward)
        rs.relative(-2);
        System.out.println("LAST TO FIRST RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+" "+ rs.getString(3));

        statement.close();
        connection.close();
    }
}
