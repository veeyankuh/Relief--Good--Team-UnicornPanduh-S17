/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import DB.DBConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import entity.product;
import java.util.ArrayList;
/**
 *
 * @author kendrick
 */
public class ProductDAO {
    Connection conn;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    public ProductDAO() throws ClassNotFoundException, SQLException {
        DBConnectionFactory myFactory = DBConnectionFactory.getInstance();
        conn = myFactory.getConnection();
    }
    
    public ArrayList<product> productsList(){
        ArrayList<product> prod = null;
        product prod2 = new product();
        try {
            pstmt = conn.prepareStatement("select * from product");
            rs = pstmt.executeQuery();
            while(rs.next()){
                prod2.setDescription(rs.getString("description"));
                prod2.setDessertName(rs.getString("dessertName"));
                prod2.setDessertpic("img/shops/"+rs.getString("sellerName")+"/"+rs.getString("dessertPic")+".jpg");
                prod2.setIsFeatured(false);
                prod2.setPrice(2);
                prod2.setSellerName("");
            }
        } catch(Exception e){
            
        }
        return prod;
    }
}
