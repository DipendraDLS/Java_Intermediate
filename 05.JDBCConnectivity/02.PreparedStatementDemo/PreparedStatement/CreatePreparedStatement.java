package PreparedStatement;

import java.sql.*;

public class CreatePreparedStatement
{
    public static void main(String[] args) throws SQLException
    {
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

// ************************************ Executing SQL PreparedStatement ***************************************************************************
        String sql = String.format("Insert into contacts (name,phone) Values (?,?)");

        PreparedStatement statement = connection.prepareStatement(sql);

        //****************** Binding Parameter ******************************************************
        String name = "Ram";
        String phone = "9860124245";
        statement.setString(1,name);
        statement.setString(2,phone);

        int rowInserted = statement.executeUpdate();

        //******************** message for user if rows are  successfully updated or not **********
        if(rowInserted>0)
            System.out.println("Row Inserted Successfully!");
        else
            System.out.println("Row Insertion Failed!!");

        statement.close(); //statement has to be close.
        connection.close(); // connection is also closed.

    }

}
