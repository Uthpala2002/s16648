import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDeleteDemo {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/tdb", "root", "1234");
             Statement stmt = con.createStatement()) {

            //Update record
            String updateSql = "UPDATE students SET age=21 WGERE name='Mary'";
            int updated = stmt.executeUpdate(updatesql);
            System.out.println("" + updated + "record(s) updated");

            //Delete Record
            String deleteSql = "DELETE FROM students WHERE name='Raj'";
            int deleted = stmt.executeUpdate(deleteSql);
            System.out.printf("" + deleted + "record(s) deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
