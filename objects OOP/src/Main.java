import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Kietden313");

            String sql = "SELECT * FROM User";

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()){
                String user = result.getString(2);
                String pass = result.getString(3);
                String fullname = result.getString("fullname");
                String email = result.getString("email");

                String output = "User #%d: %s - %s - %s - %s";
                System.out.println(String.format(output, ++count, user, pass, fullname, email));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}