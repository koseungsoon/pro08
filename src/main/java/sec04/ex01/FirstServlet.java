package sec04.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기는 FirstServlet "+ request);
		
		request.setAttribute("address", "미금");
		RequestDispatcher dis=request.getRequestDispatcher("second");
		dis.forward(request, response);
		
//		response.sendRedirect("second");
		//Redirect 방식은 서블릿에서 바인딩한 데이터를 다른 서블릿으로 전송할 수 없다.
		//향후 배우는 P(post)R(redirect)G(get)패턴에서 자세하게 다룰예정
		
		
		
	}

}
