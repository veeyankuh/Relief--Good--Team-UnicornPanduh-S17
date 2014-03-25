package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import DB.ConnectionFactory;
import MODEL.OrganizationModel;

public class OrganizationDAO {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    
    public boolean addOrganization(OrganizationModel org){
    	int current=0;
        try{
            ConnectionFactory connectionFactory = ConnectionFactory.getInstance();
            con = connectionFactory.getConnection();
            ps = con.prepareStatement("select MAX(ID) from dbo.Organization");
            rs = ps.executeQuery();
                while(rs.next()){
                    current=rs.getInt(1);
                }
                
            ps = con.prepareStatement("insert into Organization(ID, orgName, capacity, address, username, password) values(?, ?, ?, ?, ?, ?)");
            ps.setInt(1, current+1);
            ps.setString(2, org.getOrgName());
            ps.setInt(3, org.getCapacity()); 
            ps.setString(4, org.getAddress()); 
            ps.setString(5, org.getUsername());
            ps.setString(6, org.getPassword());
            ps.executeUpdate();
            System.out.println("Retrieve Success");
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean checkDuplicate(String username){
    LinkedList<OrganizationModel> list = getOrganizations();
    for(int i=0; i<list.size(); i++)
        if(list.get(i).getUsername().equals(username))
                return true;
    return false;
    }
      /*  public boolean modifyUserProfile(String username,String password)
        {
            ArrayList<AccountModel> list = getAccounts();
            
        }*/
/*
    public boolean validateAdmin(String username){
        LinkedList<AccountModel> list = getAccountsByUsername(username);
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getAccount_type().toLowerCase().equals("administrator")){
                return true;
            }   
        }
        return false;
    }  
  */      
    
    public void closeAll(){
        ConnectionFactory.closeConnection(con);
        ConnectionFactory.closeResultSet(rs);
        ConnectionFactory.closeStatement(ps);
    }
    
    public boolean validate(OrganizationModel accountModel){
        LinkedList<OrganizationModel> list = getOrganizations();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getUsername().equals(accountModel.getUsername())){
                return true;
            }
        }
        return false;
    }
    
    public boolean login(OrganizationModel accountModel){
        LinkedList<OrganizationModel> list = getOrganizations();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getUsername().equals(accountModel.getUsername()) &&
                    list.get(i).getPassword().equals(accountModel.getPassword())){
                return true;
            }
        }
        return false;
    }
    
  public LinkedList<OrganizationModel> getOrganizations(){  
 		LinkedList <OrganizationModel> list = new LinkedList<OrganizationModel>();
 		OrganizationModel temp;
        try{
            ConnectionFactory conFactory = ConnectionFactory.getInstance();
            con = conFactory.getConnection();
            ps = con.prepareStatement("SELECT * FROM dbo.Organization");
            rs = ps.executeQuery();
            while(rs.next()){
            	temp = new OrganizationModel();
				temp.setID(rs.getInt("ID"));
				temp.setOrgName(rs.getString("orgName"));
				temp.setCapacity(rs.getInt("capacity"));
				temp.setAddress(rs.getString("address"));
				temp.setUsername(rs.getString("username"));
				temp.setPassword(rs.getString("password"));
                list.add(temp);
            }
            closeAll();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
 
 public LinkedList<OrganizationModel> getOrganizationByName(String name){  
	 LinkedList <OrganizationModel> list = new LinkedList<OrganizationModel>();
	 OrganizationModel temp;
     try{
    	 ConnectionFactory conFactory = ConnectionFactory.getInstance();
    	 con = conFactory.getConnection();
         ps = con.prepareStatement("SELECT * FROM dbo.Organization WHERE orgName like ?");
         ps.setString(1,name);
         rs = ps.executeQuery();
         while(rs.next()){
        	 temp = new OrganizationModel();
        	 temp.setID(rs.getInt("ID"));
        	 temp.setOrgName(rs.getString("orgName"));
        	 temp.setCapacity(rs.getInt("capacity"));
        	 temp.setAddress(rs.getString("address"));
        	 temp.setUsername(rs.getString("username"));
        	 temp.setPassword(rs.getString("password"));
             list.add(temp);
            }
            closeAll();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

 	public boolean deleteAccountbyUsername(String username){
 		try{
 			ConnectionFactory conFactory = ConnectionFactory.getInstance();
            con = conFactory.getConnection();
            ps= con.prepareStatement("DELETE FROM dbo.Organization WHERE username like ?");
            ps.setString(1,username);
            ps.executeUpdate();
            closeAll();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
     }
 	
 	public boolean updateCapacity(OrganizationModel org){
 		try{
 			ConnectionFactory conFactory = ConnectionFactory.getInstance();
            con = conFactory.getConnection();
            //Not sure if correct SQL Command
            ps= con.prepareStatement("UPDATE dbo.Organization SET capacity=? WHERE username=?");
            ps.setInt(1, org.getCapacity());
            ps.setString(2,org.getUsername());
            ps.executeUpdate();
            closeAll();
            return true;
 		}catch(SQLException e){
 			e.printStackTrace();
 		}
 		return false;
 	}
 	
 	public LinkedList<OrganizationModel> getOrganizationByAddress(String address){
 		 LinkedList <OrganizationModel> list = new LinkedList<OrganizationModel>();
 		 OrganizationModel temp;
 	     try{
 	    	 ConnectionFactory conFactory = ConnectionFactory.getInstance();
 	    	 con = conFactory.getConnection();
 	         ps = con.prepareStatement("SELECT * FROM dbo.Organization WHERE address like ?");
 	         ps.setString(1, "%"+address+"%");
 	         rs = ps.executeQuery();
 	         while(rs.next()){
 	        	 temp = new OrganizationModel();
 	        	 temp.setID(rs.getInt("ID"));
 	        	 temp.setOrgName(rs.getString("orgName"));
 	        	 temp.setCapacity(rs.getInt("capacity"));
 	        	 temp.setAddress(rs.getString("address"));
 	        	 temp.setUsername(rs.getString("username"));
 	        	 temp.setPassword(rs.getString("password"));
 	             list.add(temp);
 	            }
 	            closeAll();
 	        }catch(SQLException e){
 	            e.printStackTrace();
 	        }
 	        return list;
 	}
}
