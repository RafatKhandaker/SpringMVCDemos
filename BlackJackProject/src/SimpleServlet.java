import java.io.IOException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"/Home"})
public class SimpleServlet extends HttpServlet {
	String connstr;
	String webConnstr;
	
	@Override
	public void init() throws ServletException {
		connstr = "Product";
		webConnstr = getServletContext().getInitParameter("webConnstr");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String parameter = req.getParameter("name");

		if(!parameter.equals("")){
			resp.setContentType("text/xhtml");
			resp.getWriter().printf(
					"\n<name>Hello "+parameter+ "</name>" +
					"\n<product>"+connstr+"</product>" + 
					"\n<Newproduct>"+webConnstr+"</Newproduct>"
					);
		}else {
			resp.getWriter().write("please enter name");
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String parameter = req.getParameter("name");
		if(!parameter.equals("")) {
			resp.getWriter().printf("Hello %s", parameter);
			}else {
			resp.sendRedirect("Index.jsp");
		}
	}

}
