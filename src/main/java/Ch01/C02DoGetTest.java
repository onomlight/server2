package Ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetTest.do")
public class C02DoGetTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// HttpServletRequest HttpServletResponse 중요한 녀석임 / 
		//파라미터 받기
		String userid = req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		
		//해더추가(한글깨짐 방지,Html코드 적용) [br태그가 안먹히는거에대해 수정하기위해]
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		//브라우저로 내보낼 out 객체 꺼내기
		PrintWriter out = resp.getWriter();
		
		//브라우저로  Code 전송
		out.println("USERID : " + userid+"<br>");
		out.println("PWD : " + pwd);
	}

}
