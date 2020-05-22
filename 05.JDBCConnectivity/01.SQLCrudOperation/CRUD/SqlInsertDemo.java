package CRUD;

import java.sql.*;

public class SqlInsertDemo
{
    public static void main(String[] args) throws SQLException
    {
//********************************************* Establishing Connection to the Database ************************************************

        String url = "jdbc:MySQL://localhost:3306/JavaJDBC?useSSL=false"; //jdbc-> means protocol name. (predefined in while using JDBC)
        //MySQL-> sub protocol
        //localhost:3306 -> port number
        //JavaJDBC -> Database name
        //useSSL = false -> (In ubuntu only, if not set to false warning appears.)

        String username = "admin";    //For connection we need 'username' and 'password'
        String password= "admin";

        //For Establishing the connection into the database we use 'Connection' interface.

        Connection connection = DriverManager.getConnection(url,username,password); //'connection' variable must contain some object address for that we use
        //DriverManager function and pass the url, username, password.

// ************************************ Executing SQL Statement ***************************************************************************

        Statement statement= connection.createStatement();       //To execute Sql statement  we need Statement object and to create 'statement'
        //object we use 'connection.createStatement()' function.
        String sql = String.format("Insert into contacts (name,phone)Values('Hari','9841062550')");           // Sql Insert query.
        int rowInserted = statement.executeUpdate(sql); //'statement.executeQuery(sql)' -> for executing the sql statement in database and returns the no. of affected  rows.

        if(rowInserted>0)
            System.out.println("Row Inserted Successfully!");
        else
            System.out.println("Row Insertion Failed!!");

        statement.close(); //statement has to be close.
        connection.close(); // connection is also closed.
    }
}
