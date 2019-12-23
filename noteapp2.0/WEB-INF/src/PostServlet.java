import javax.servlet.ServletException;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PostServlet", urlPatterns = { "/post" })
public class PostServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes", "root", "");

			PreparedStatement insertstmt = con.prepareStatement("insert into note1 values(?,?,now())");
			insertstmt.setString(1, title);
			insertstmt.setString(2, content);

			int i = insertstmt.executeUpdate();
			out.println(i);
			
			con.close();
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
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		doGet(request,response);
	}
}
