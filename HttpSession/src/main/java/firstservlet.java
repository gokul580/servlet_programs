import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class firstservlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			PrintWriter out= resp.getWriter();
			
			String n= req.getParameter("username");
			out.print("welcome"+n);
			HttpSession session = req.getSession();
			session.setAttribute("uname", n);
			out.print("<a href='servlet2'>visit</a>");
			
			
			out.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	}

}
