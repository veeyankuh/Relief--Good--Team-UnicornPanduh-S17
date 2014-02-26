/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;

/**
 *
 * @author kendrick
 */

import java.sql.Connection;
public abstract class DBConnectionFactory {
    private String driverName="com.mysql.jdbc.Driver";
    //mileStone2 is the name of the db / schema
    private String url = "jdbc:mysql://localhost:3306/milestone2";
    private String username = "devweb";
    private String password = "Closeup25";
    
    public static DBConnectionFactory getInstance(){
        return new DBConnectionFactoryImpl();
    }
    
    public abstract Connection getConnection();

    public String getDriverName() {
        return driverName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
