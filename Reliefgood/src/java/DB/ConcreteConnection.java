package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConcreteConnection extends ConnectionFactory{
	private String servName = "upa54k278y.database.windows.net:1433;";
	private String dbName = "databaseName=webapps;";
	private String user = "user=unicornpanduh@upa54k278y;";
	private String pass = "password=Hello123";
	private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String urlConnection = "jdbc:sqlserver://"+servName+dbName+user+pass;
    
    public Connection getConnection(){
        try{
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(urlConnection);
            return connection;
        } catch (ClassNotFoundException classNotFoundException){
            classNotFoundException.printStackTrace();
        } catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
        return null;
        
    }
    
}
