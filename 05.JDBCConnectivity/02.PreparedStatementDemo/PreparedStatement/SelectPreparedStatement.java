package PreparedStatement;

import java.sql.*;

public class SelectPreparedStatement
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

        //********************** Sql Prepared Statement************************************

        String sql = "select * from contacts where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        int id =1; //only select rows with id 1.
        statement.setInt(1,id);

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next())
        {
            System.out.printf("%d, %s, %s, \n",
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("phone")
            );
        }

        statement.close(); //statement has to be close.
        connection.close(); // connection is also closed.

    }

}
