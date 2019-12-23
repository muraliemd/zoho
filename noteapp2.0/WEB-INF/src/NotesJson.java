import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.*;
import java.sql.*;

@WebServlet(name = "NotesJson", urlPatterns = {"/getnotes"})
public class NotesJson extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		PrintWriter out = response.getWriter();
		
		try 
		{	
			JSONArray array = new JSONArray(); 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes", "root", "");
			
			PreparedStatement stmt = con.prepareStatement("select * from note1 order by date desc");
			stmt.execute(); 
			ResultSet resultSet= stmt.getResultSet();
			
			while (resultSet.next())
			{
				JSONObject record = new JSONObject();
				record.put("title", resultSet.getString("title"));
				record.put("content", resultSet.getString("content"));
				
				array.put(array.length(), record);
			}
			
			out.println(array);
		}
		catch(Exception e)
		{
			out.println(e);
		}	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		doGet(request,response);
	}
}