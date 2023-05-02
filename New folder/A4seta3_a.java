
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A4seta3_a
 */
@WebServlet("/A4seta3_a")
public class A4seta3_a extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public A4seta3_a() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String n1 = request.getParameter("t1");
		String n2 = request.getParameter("t2");
		
		String user = "abc";
		String pass = "123";
		
		if (n1.equals(user)&&n2.equals(pass)) {
			pw.println("<form method = 'GET' action = 'http://localhost:8080/ass4seta3/A4seta3_b'"
			+"<h4> Select Books </h4><br>"
			+"<input type = 'checkbox' name = 'bk' value = 'English 100'> English <br>"
			+"<input type = 'checkbox' name = 'bk' value = 'Maths 200'> Maths <br>"
			+"<input type = 'checkbox' name = 'bk' value = 'History 300'> History <br>"
			+"<input type = 'checkbox' name = 'bk' value = 'Science 400'> Science <br>"
			+"<input type = 'submit' value = 'submit'>"
			+"<input type = 'reset' value = 'reset'>"
			+"</form>");
		}
		else {
			pw.println("Login Failed!!!!!!!");
		}
		
	}

}
