package Ch02;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join.do")
public class C03Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		req.getRequestDispatcher("/WEB-INF/03MemberJoin.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		req.getRequestDispatcher("/WEB-INF/03Result.jsp").forward(req, resp);
	}
	

 //URL : /join.do
	// doGet()로 /WEB-INF/03MemberJoin.jsp 로 Forward
	
	// 03MemberJoin.jsp에는
	// 파라미터 email, pwd , addr1 , addr2의 값을 입력해서
	
	// 다시 / Join.do로 전달 post방식으로 전달
	// 서블릿에서는 doPost()로 파라미터를 전부를 받아서 콘솔창에 출력한뒤
	
	// 03Result.jps로 Forward
	// 03Result.jsp에서는 받은 파라미터를 브라우저 화면에 출력할 것
	 
	 
	
	
}
