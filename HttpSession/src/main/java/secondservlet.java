import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class secondservlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		
		try {
			PrintWriter out = resp.getWriter();
			
			HttpSession session=req.getSession(false);
			String n=(String)session.getAttribute("uname");
			out.print("hello"+n);
			
			
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
