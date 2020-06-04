package BatchUpdate;

import java.sql.*;

public class BatchUpdateDemo
{
    public static void main(String[] args)
    {
        try {

            String url = "jdbc:MySQL://localhost:3306/JavaJDBC?useSSL=false";
            String username = "admin";    //For connection we need 'username' and 'password'
            String password = "admin";

            Connection connection = DriverManager.getConnection(url, username, password);

            connection.setAutoCommit(false);

            Statement statement = connection.createStatement();
            statement.addBatch("INSERT INTO contacts(name,phone) VALUES('Preeti','9860111111')");
            statement.addBatch("INSERT INTO contacts(name,phone) VALUES('Suman','9860222222')");
            statement.addBatch("INSERT INTO contacts(name,phone) VALUES('Reet','9860333333')");
            statement.addBatch("INSERT INTO contacts(name,phone) VALUES('Riya','9860444444')");

            statement.executeBatch(); //executing batch process
            connection.commit();
            System.out.println("commit successful");
        }
        catch (BatchUpdateException b)
        {
            b.printStackTrace();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("commit failed!!");
        }
    }

}
