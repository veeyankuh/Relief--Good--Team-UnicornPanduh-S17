import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;



public class DB {
	private String servName = "upa54k278y.database.windows.net:1433;";
	private String dbName = "databaseName=webapps;";
	private String user = "user=unicornpanduh@upa54k278y;";
	private String pass = "password=Hello123";
	private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String urlConnection = "jdbc:sqlserver://"+servName+dbName+user+pass;
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs; 
	
	public void startConnection(){
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(urlConnection);
		}catch(SQLException e){
			System.out.println("Error Connecting To Database");
		}catch(ClassNotFoundException f){
			System.out.println("Driver Not Found");
		}
	}
	
	public LinkedList<OrganizationContainer> getOrgs(){
		LinkedList<OrganizationContainer> list = new LinkedList<OrganizationContainer>();
		OrganizationContainer temp;
		startConnection();
		try{
			ps = con.prepareStatement("SELECT * FROM dbo.Organization");
			rs = ps.executeQuery();
			while(rs.next()){
				temp = new OrganizationContainer();
				temp.setId(rs.getInt("ID"));
				temp.setOrgName(rs.getString("orgName"));
				temp.setCapacity(rs.getInt("capacity"));
				temp.setAddress(rs.getString("address"));
				temp.setUsername(rs.getString("username"));
				temp.setPassword(rs.getString("password"));
				list.add(temp);
			}
			con.close();
		}catch(SQLException e){
			System.out.println("Error Retrieving Data From Database");
		}
		return list;
	}
	
	public void addOrg(OrganizationContainer org){
		int current=0;
		startConnection();
		
		try{
			 //Get max ID, add one, make the sum the ID of current item  
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
             System.out.println("Item Successfully Added");
             con.close();
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Error Adding Data To Database");
		}
	}
	
}
