package Ch01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/Servlet1.do")
public class C01ServletTest extends HttpServlet{//상속관계를 만들어서 그대로 기능 물려받게해야함
	@Override
	public void init() throws ServletException {
	//최초로 한번만 실행되는함수
		System.out.println("INIT함수 호출됨!!");
		System.out.println("!!!");
		System.out.println("!!!");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service 함수 호출됨!!");
		System.out.println("!!!");
		System.out.println("!!!");
	}

	@Override
	public void destroy() {
		 //수정하거나 그럴때 출력되는함수
		System.out.println("Destroy 함수 호출됨!!");
	}

	

}
