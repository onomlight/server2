package Ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/MemberJoin.do")
public class C04Prac extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//서블릿 파일 만들기(URL: /MemberJoin.do
		//DoPost함수 오버라이딩 하기
		//Form으로 부터 요청이 들어오면 해당  파라미터를 브라우저로 전송합니다
		//form에서 전송하는 내용은
		// userid,eamil,addr1,addr2,입니다
		//04form.jsp를 만들어서 진행합니다 
		
		System.out.println("DoPost 함수실행!!");
		//파라미터 받기
		String userid = req.getParameter("userid");
		String eamil = req.getParameter("pwd");
		String addr1 = req.getParameter("addr1");
		String addr2 = req.getParameter("addr2");
		
		//헤더 추가(한글깨짐 방지, Html코드 적용)
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		//브라우저로 보낼 out객체 꺼내기
		PrintWriter out =   resp.getWriter();
		
		//브라우저로 Code 전송 
		out.println("USERID : " + userid+"<br>");
		out.println("EMAIL : " + eamil);
		out.println("ADDR1 : " + addr1+"<br>");
		out.println("ADDR2 : " + addr2);
	}

	
	
}
