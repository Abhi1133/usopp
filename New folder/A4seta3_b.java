

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/A4seta3_b")
public class A4seta3_b extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public A4seta3_b() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		HttpSession hs = request.getSession(true);
		
		String values[]= request.getParameterValues("bk");
		
		for (int i=0 ; i<values.length ; i++) {
			int j = values[i].indexOf(' ');
			String name = values[i].substring(0,j);
			String val = values[i].substring(j+1);
			hs.setAttribute(name, val);
		}
		
		pw.println("<form method = 'GET' action = 'http://localhost:8080/ass4seta3/A4seta3_c'"
				+"<h4> Select Practical Books </h4><br>"
				+"<input type = 'checkbox' name = 'bk' value = 'Physics 100'> Physics <br>"
				+"<input type = 'checkbox' name = 'bk' value = 'Chemistry 200'> Chemistry <br>"
				+"<input type = 'checkbox' name = 'bk' value = 'Biology 300'> Biology <br>"
				+"<input type = 'submit' value = 'submit'>"
				+"<input type = 'reset' value = 'reset'>"
				+"</form>");
		
	}

}
