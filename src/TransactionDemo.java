import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionDemo {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/tdb", "root", "1234")) {

            con.setAutoCommit(false);

            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO students (name,age) VALUES ('Nimal',20),('Ama',24)");
            stmt.executeUpdate("UPDATE students SET age=25 WHERE name='Ann'");

            con.commit();
            System.out.println("Transaction Commited.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
