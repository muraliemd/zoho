import javax.servlet.ServletException;
import java.sql.*; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetServlet", urlPatterns = {"/get"})
public class GetServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		PrintWriter out = response.getWriter();
		String title = request.getParameter("title");
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes", "root", "");
			Statement stmt = con.createStatement();
			String query = "select * from note where title=\"" + title + "\"";
			ResultSet resultSet = stmt.executeQuery(query);

			if (resultSet.next()) 
			{
				String data = resultSet.getString("content");
				out.println(data);
				return;
			}
			else 
			{
				out.println(404);
				return;
			}	
		} 
		
		catch (Exception e) 
		{
			out.println(e);
		} 
		finally 
		{
			out.close();
		}
	}
}
