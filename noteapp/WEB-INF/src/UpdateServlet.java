import javax.servlet.ServletException;
import java.sql.*; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UpdateServlet", urlPatterns = {"/update"})
public class UpdateServlet extends HttpServlet
{
	@Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException 
    {
    	PrintWriter out = response.getWriter();
		String title = request.getParameter("title");
		String content =  request.getParameter("content");
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes", "root", "");		
			Statement stmt = con.createStatement();
			String query = "select * from note where title=\"" + title + "\"";
			ResultSet resultSet = stmt.executeQuery(query);

			if (resultSet.next()) 
			{
				PreparedStatement insertstmt=con.prepareStatement("update note set content=? where title=?");  
				insertstmt.setString(2,title);  
				insertstmt.setString(1,content);  
				  
				int i=insertstmt.executeUpdate();  
				if(i>0)						//Update successfully
				out.println(2);
			}
			
			else
			{
				out.println(404); //Title Not Exist
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