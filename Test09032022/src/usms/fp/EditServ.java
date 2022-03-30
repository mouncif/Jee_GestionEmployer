package usms.fp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
package usms.fp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoEmployer;
import Dao.Employer;

/**
 * Servlet implementation class EditServ
 */
@WebServlet("/EditServ")
public class EditServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i=0;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		
		DaoEmployer.startConnection();
		 Employer e = DaoEmployer.find(Integer.parseInt(id));

         out.print("<form action=UpdateServ method=post>");
         out.print("<input type=hidden name=id value="+e.getId()+"><br/>");
         out.print("Nom : <input name=name value="+e.getName()+"><br/>");
         out.print("Password : <input name=pass value="+e.getPassword()+"><br/>");
         out.print("Email : <input name=email value="+e.getEmail()+"><br/>");
         out.print("Country : <input name=country value="+e.getCountry()+"><br/>");
         out.print("<input type=submit value=Update></form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
