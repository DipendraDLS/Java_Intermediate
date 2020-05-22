package CRUD;

import java.sql.*;

public class SqlSelectDemo
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
        String sql = "select * from contacts";           // Sql select query.
        ResultSet resultSet = statement.executeQuery(sql); //'statement.executeQuery(sql)' -> for executing the sql statement in database and returns the ResultSet object .

        while (resultSet.next())  //Inorder to get all the record from database table we use loop along with '.next()' which sets the pointer and points all of the records.
        //pointer returns true until it finds the records in the database table and returns false if no records are found.
        {
            System.out.printf("%d, %s, %s, \n",
                    resultSet.getInt("id"),   //'id' is of type integer in our database table so it's int.
                    resultSet.getString("name"), //'name is' of type varchar in our database table so it's String.
                    resultSet.getString("phone") //'number' is of type varchar in our database table so it's String.
            );
        }
        statement.close(); //statement has to be close.
        connection.close(); // connection is also closed.
    }
}
