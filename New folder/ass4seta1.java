

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Servlet implementation class ass4seta1
 */
@WebServlet("/ass4seta1")
public class ass4seta1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ass4seta1() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			try {
				
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print("<html><body>");
				java.util.Properties p = System.getProperties();
				
				out.println("IP Address: "+request.getRemoteAddr()+"<br>");
				out.println("Remote User: "+request.getRemoteUser()+"<br>");
				out.println("Remote Host: "+request.getRemoteHost()+"<br>");
				out.println("Local Name: "+request.getLocalName()+"<br>");
				out.println("Server Port: "+request.getServerPort()+"<br>");
				out.println("server Name: "+request.getServerName()+"<br>");
				out.println("Protocol Name: "+request.getProtocol()+"<br>");
				out.println("OS and Browser Details -> "+request.getHeader("User-Agent"));
				
			}
			catch(Exception e) {
				
			}
	}

}
