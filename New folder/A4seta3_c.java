

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/A4seta3_c")
public class A4seta3_c extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public A4seta3_c() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		HttpSession hs = request.getSession(true);
		Enumeration<String> e = hs.getAttributeNames();
		
		int tot1=0;
		pw.println("<h4> Page 1</h4><table border = 1> <tr><th>Name</th> <th>Rate</th></tr>");
		while (e.hasMoreElements()) {
			String name = (String)e.nextElement();
			String val = (String)hs.getAttribute(name);
			
			pw.println("<tr><td>"+name+"</td><td>"+val+"</td></tr>");
			
			tot1 += Integer.parseInt(val);
			
		}
		pw.println("<table><br> page 1 total: <br> Rs: "+tot1+"<br><br>");
		
		int tot2=0;
		String values[]=request.getParameterValues("bk");
		pw.println("<h4> Page 2</h4><table border = 1> <tr><th>Name</th> <th>Rate</th></tr>");
		
		for (int i=0 ; i<values.length ; i++) {
			int j=values[i].indexOf(' ');
			String name = values[i].substring(0,j);
			String val = values[i].substring(j+1);
			tot2 += Integer.parseInt(val);
			
			pw.println("<tr><td>"+name+"</td><td>"+val+"</td><tr>");
			
			
		}
		
		pw.println("<table><br> page 2 total: <br> Rs: "+tot2+"<br><br>");
	}

}
