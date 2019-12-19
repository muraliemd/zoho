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
			Statement stmt = con.createStatement();
			String query = "select * from note where title=\"" + title + "\"";
			ResultSet resultSet = stmt.executeQuery(query);

			if (resultSet.next()) 
			{
				out.println(-1); // Already Title exist.
				return;
			}

			PreparedStatement insertstmt = con.prepareStatement("insert into note values(?,?)");
			insertstmt.setString(1, title);
			insertstmt.setString(2, content);

			int i = insertstmt.executeUpdate();
			out.println(i);
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
