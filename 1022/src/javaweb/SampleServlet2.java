
package javaweb;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SampleServlet2")
public class SampleServlet2 extends HttpServlet {

    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response)
    		throws IOException, ServletException
    		{
    		this.doPost(request, response);
    		}


	public void doPost(HttpServletRequest req,HttpServletResponse res)
	         throws ServletException, IOException{

		String name = req.getParameter("name");
		String message = "こんにちは、" + name + "さん";

		req.setAttribute("message", message);

		req.getRequestDispatcher("/next.jsp").forward(req, res);

	}
}