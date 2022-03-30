package usms.fp;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoEmployer;
import Dao.Employer;
import view.HtmlView;

/**
 * Servlet implementation class ViewServ
 */
@WebServlet("/ViewServ")
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		DaoEmployer.startConnection();
		List<Employer> emps = DaoEmployer.getAll();
		out.print(HtmlView.doc);
		out.print(HtmlView.header);
		out.print(HtmlView.style);
		out.print(HtmlView.ctn1);
		
		String str = "<table class=\"table table-striped\"><thead><tr><th>id</th><th>name</th><th>password</th><th>email</th><th>Country</th><th>Actions</th></tr>";
		for(Employer e:emps)
		  str+="</thead><tbody><tr><td>"+e.getId()+"</td><td>"+
		       e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+
			   e.getEmail()+"</td><td>"+e.getCountry() +"</td>"
			   		+ "<td><a href=EditServ?id="+e.getId()+">Edit</a></td>"
			   		+ "<td><a href=DeleteServ?id="+e.getId()+">Delete</a></td></tr>";
        
		str+="</tbody></table>";
		out.print(str);
		out.print(HtmlView.ctn2);
		out.print(HtmlView.finHtml);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
