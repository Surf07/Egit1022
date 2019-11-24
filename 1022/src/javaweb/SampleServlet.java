package javaweb;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {


	public void doPost(HttpServletRequest req,HttpServletResponse res)
	         throws ServletException, IOException{

		String name = req.getParameter("name");
		PrintWriter writer = res.getWriter();

		writer.write("<h1>");
		writer.write("Hello, " + name);
		writer.write("</h1>");

		writer.close();
	}
}
