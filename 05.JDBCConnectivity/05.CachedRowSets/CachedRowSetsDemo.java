package CachedRowSets;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CachedRowSetsDemo
{

    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:MySQL://localhost:3306/JavaJDBC?useSSL=false";
        String username = "admin";    //For connection we need 'username' and 'password'
        String password = "admin";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        String sql = "select * from contacts";
        ResultSet rs = statement.executeQuery(sql);

        RowSetFactory factory = RowSetProvider.newFactory(); //An interface that defines the implementation of a factory that is used to obtain different types of RowSet implementations.
        CachedRowSet crs = factory.createCachedRowSet(); //CachedRowSet is a subinterface of the ResultSet interface. A cached row set caches all data from a result set in local memory
        crs.populate(rs);

        statement.close();
        connection.close();

        //Even after the connection is closed we can still access the content from database due to CachedRowSet
        while(crs.next())
        {
            String name = crs.getString("name");
            String phone = crs.getString("phone");

            System.out.printf("%s %s \n", name, phone);
        }

    }
}
