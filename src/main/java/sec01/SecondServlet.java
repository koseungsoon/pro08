package sec01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기는 SecondServlet"+request);
		
		response.setContentType("text/html; Charset=utf-8");
		
//		String name = request.getParameter("name");
//		System.out.println(name);
		
		String data=(String)request.getAttribute("money");
		System.out.println(data);
		
		PrintWriter pw=response.getWriter();
		pw.write("kkk"+data);
		
	}

}
