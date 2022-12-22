package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    String driver;
    String dbName;
    String connectionURL;
    String username;
    String password;

    public DatabaseConnection() {
        driver = "org.postgresql.Driver";
        connectionURL = "jdbc:postgresql://localhost:5432/";
        dbName = "candy-shop";
        username = "postgres";
        password = "postgres";
    }

    public Connection getConnection() throws Exception {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(connectionURL + dbName, username, password);

        return connection;
    }

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        try {
            Connection conn = db.getConnection();
            System.out.println("Database successfully connected!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
