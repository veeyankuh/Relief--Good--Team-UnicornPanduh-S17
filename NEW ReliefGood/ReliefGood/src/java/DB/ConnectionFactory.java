package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class ConnectionFactory {
	
	  public abstract Connection getConnection();
      
      public static ConnectionFactory getInstance()
      {
          return new ConcreteConnection();
      }
      
      public static void closeResultSet(ResultSet resultSet)
      {
          try{
              resultSet.close();
          }catch(Exception exception){
              
          }

      }
      public static void closeConnection(Connection connection)
      {
          try{
              connection.close();
          } catch (Exception exception){
              
          }
      }
      
      public static void closeStatement(Statement statement)
      {
          try{
              statement.close();
          } catch (Exception exception){
              
          }
      }
}
