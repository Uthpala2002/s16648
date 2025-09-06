import java.sql.*;

public class InsertDemo {
    public static void main(String[] args){
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/tdb", "root", "1234");
             Statement stmt = con.createStatement()) {

            String sql = "INSERT INFO students (name,age) VALUES ('Ann',23),('Amal',25)";
            int rows = stmt.executeUpdate(sql);
            System.out.println(" " + rows + "record(s) inserted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
