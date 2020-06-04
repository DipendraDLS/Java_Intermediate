package CachedRowSets;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModifyingDataInCachedRowSet
{
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:MySQL://localhost:3306/JavaJDBC?useSSL=false";
        String username = "admin";    //For connection we need 'username' and 'password'
        String password = "admin";

        Connection connection = DriverManager.getConnection(url, username, password);
        connection.setAutoCommit(false); //Autocommit is set to false.

        Statement statement = connection.createStatement();

        String sql = "select * from contacts";
        ResultSet rs = statement.executeQuery(sql);

        RowSetFactory factory = RowSetProvider.newFactory(); //An interface that defines the implementation of a factory that is used to obtain different types of RowSet implementations.
        CachedRowSet crs = factory.createCachedRowSet(); //CachedRowSet is a subinterface of the ResultSet interface. A cached row set caches all data from a result set in local memory
        crs.populate(rs);

        //****** The following code updates a 1st row of CachedRowSet **********
        crs.setTableName("contacts");

        crs.first(); //updates the 1st row in the row set

        crs.updateString("name", "Dipen");
        crs.updateString("phone", "9803876900");
        crs.updateRow();

        //************** The following code inserts a new row to the row set ***********
        crs.moveToInsertRow();
        crs.updateNull("id"); //ou must call updateNull(column_name) for the primary key column of the table if that column’s values are auto-generated. Otherwise an exception throws.
        crs.updateString("name", "DLS");
        crs.updateString("phone", "9898989898");
        crs.insertRow();
        crs.moveToCurrentRow();

        //************Committing Changes to the Database********************
        crs.acceptChanges(connection); //If the CachedRowSet object is populated from a ResultSet object, pass the Connection  object to the method:

        statement.close();
        connection.close();





    }

}
