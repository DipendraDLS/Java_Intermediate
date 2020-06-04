package Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo
{
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:MySQL://localhost:3306/Bank?useSSL=false";

        String username = "admin";    //For connection we need 'username' and 'password'
        String password = "admin";

        Connection connection = DriverManager.getConnection(url, username, password);

        connection.setAutoCommit(false); // disable auto commit after each "execute"

        Statement statement = connection.createStatement();
        String debitSql = "Update MyAccount set balance = balance - 100 where id = 1";

        String creditSql = "Update MyAccount set balance = balance + 100 where id = 2";

        try {
            statement.executeUpdate(debitSql);
            statement.executeUpdate(creditSql);
            connection.commit();
            System.out.println("Balance transferred!");
        }
        catch(SQLException e)
        {
            connection.rollback();
            System.out.println("Transfer failed");
        }
        finally
        {
            connection.close();
        }
    }
}
