import javax.servlet.ServletException;
import java.sql.*; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/validate")

@WebServlet(name = "GetServlet", urlPatterns = {"/get"})
public class GetServlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		//response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = request.getParameter("title");
		
		
		
		try 
		{
			

			// String content = request.getParameter("content");

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/notes", "root", "");

			Statement stmt = con.createStatement();

			String query = "select * from note where title=\"" + title + "\"";
			ResultSet resultSet = stmt.executeQuery(query);

			if (resultSet.next()) 
			{
				String data = resultSet.getString("content");
				
				/*StringBuilder sb = new StringBuilder();
		        sb.append("Content:").append(data);
				
		        response.setContentType("application/json;charset=UTF-8");

		        ServletOutputStream out1 = response.getOutputStream();
		        String output = this.gson.toJson(sb);
        
		        out1.print(output);*/
		        
				out.println(data);
				
				return;
			}

			else 
			{
				out.println(404);
				return;
			}
			
		} 
		
		/* StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name)
                .append("Address: ").append(location)
                .append("Email ").append(email)
                .append("Gender: ").append(gender);*/
		
		
		catch (Exception e) 
		{
			out.println(e);
		} 
		finally 
		{
			out.close();
		}


	/*	Enumeration e = request.getParameterNames();
		out.println("<h2> Parameters </h2>");
		while(e.hasMoreElements())
		{
			Object obj = e.nextElement();
			String str = (String)obj;
			out.println("<h2>"+str+":"+request.getParameter(str)+"</h2>");
		}

		out.println("<h2> Header details </h2>");
		e = request.getHeaderNames();
		while(e.hasMoreElements())
		{
			Object obj = e.nextElement();
			out.println("<h2>"+(String)obj+":"+request.getHeader((String)obj)+"</h2>");
		}

*/

		/* if(username.equals("zoho") && password.equals("tenkasi"))
		{
			RequestDispatcher dis=request.getRequestDispatcher("welcome");          
          		dis.forward(request, response);   
		}		
		      
       else
       {      
          out.print("User name or password is incorrect!");          
          RequestDispatcher dis=request.getRequestDispatcher("login.html");          
          dis.include(request, response);                                
	   }       */
	   

	  /* if(userName.equals("zoho") && password.equals("tenkasi"))
	   {
			userName="Zoho";
	   }
	   else
	   {
		   userName="guest";
	   }
	   String greetings = "Hello " + userName;
		
	   
	   
	   out.println(greetings);*/

		
	}
}
