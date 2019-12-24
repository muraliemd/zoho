package connectionpool;

import java.sql.*;

public class MainClass
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		try 
		{
			BasicConnectionPool obj = BasicConnectionPool.create("jdbc:mysql://localhost:3306/notes", "root", "");	
			
			Connection con = obj.getConnection(); // .getConnection();
			
			PreparedStatement stmt = con.prepareStatement("select * from note1 order by date desc");
			stmt.execute(); 
			ResultSet resultSet= stmt.getResultSet();
			
			while (resultSet.next())
			{
				System.out.print("title: "+ resultSet.getString("title"));
				System.out.println(" content: "+ resultSet.getString("content"));	
			}	
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		

	}

}
