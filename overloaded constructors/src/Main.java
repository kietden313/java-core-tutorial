import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password= "Kietden313";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            if (conn != null) {
                System.out.println("Connected");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
            }
        }
}
