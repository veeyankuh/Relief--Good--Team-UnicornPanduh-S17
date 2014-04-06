package DBConnection;

import java.sql.Connection;

public abstract class DBConnectionFactory {

    /*
    private final String driverName = "com.mysql.jdbc.Driver";
    sdfo is the name of the db / schema
    private final String url = "jdbc:mysql://localhost:3306/sdfo";
    private final String username = "devweb";
    private final String password = "mysql"; 
    private static String datasource = "jdbc/reliefgood";*/
    
    private String driverName="com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String pass = "p@ssword";
    private static String host = "localhost";
    private static String port = "3306";
    private static String url = "jdbc:mysql://" + host + ":" + port + "/reliefgood";

    public static DBConnectionFactory getInstance() {
        return new DBConnectionFactoryImpl();
    }

    public String getDriverName() {
        return driverName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return user;
    }

    public String getPassword() {
        return pass;
    }
    
    public abstract Connection getConnection();
}
