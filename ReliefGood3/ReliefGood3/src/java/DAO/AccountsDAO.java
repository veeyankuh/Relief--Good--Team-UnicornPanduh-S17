package DAO;

import DBConnection.DBConnectionFactory;
import Entity.accountsEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kendrick
 */
public class AccountsDAO {

    public void insertAccount() {
        DBConnectionFactory myFactory = DBConnectionFactory.getInstance();
        Connection conn = myFactory.getConnection();
        try {
            PreparedStatement pstmt = conn.prepareStatement("insert into accounts (username, firstName, lastName, areaId, email, password, orgName, orgContactNum, areaAddress, neededVolunteers) values(?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, "arniki");
            pstmt.setString(2, "Arneil");
            pstmt.setString(3, "Leonin");
            pstmt.setInt(4, 5);
            pstmt.setString(5, "arneil@gmail.com");
            pstmt.setString(6, "password");
            pstmt.setString(7, "LSCS");
            pstmt.setString(8, "09279089406");
            pstmt.setString(9, "09279089406");
            pstmt.setInt(10, 3);
            pstmt.execute();
        } catch (Exception e) {
        }
    }

    public accountsEntity getAccounts(String username, String password) {
        DBConnectionFactory myFactory = DBConnectionFactory.getInstance();
        Connection conn = myFactory.getConnection();
        accountsEntity accountholder = new accountsEntity();
        try {
            PreparedStatement pstmt = conn.prepareStatement("select * from accounts where username=? and password=?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                accountholder.setUsername(rs.getString("username"));
                accountholder.setFirstName(rs.getString("firstName"));
                accountholder.setLastName(rs.getString("LastName"));
                accountholder.setAreaAddress(rs.getString("AreaAddress"));
                accountholder.setAreaId(rs.getInt("AreaId"));
                accountholder.setEmail(rs.getString("email"));
                accountholder.setOrgContactNum(rs.getString("OrgContactNum"));
                accountholder.setNeededVolunteers(rs.getInt("NeededVolunteers"));
                accountholder.setOrgName(rs.getString("OrgName"));
                accountholder.setAreaName(rs.getString("areaName"));
            }
        } catch (Exception e) {
            Logger.getLogger(AccountsDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return accountholder;
    }
    

}
