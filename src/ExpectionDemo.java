import java.sql.*;

public class ExpectionDemo {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/tdb", "root", "1234")) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Code: " + e.getMessage());
            System.out.println("State: " + e.getMessage());

        }
    }
}
