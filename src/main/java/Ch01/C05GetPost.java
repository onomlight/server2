package Ch01;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/C05Join.do")
public class C05GetPost extends HttpServlet{
	
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String id="c##book_ex";
	String pw="1234";
	
	Connection conn=null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@Override
	public void init() throws ServletException {
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 conn=DriverManager.getConnection(url,id,pw);
			 System.out.println("DB Connected.....");			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DoGet!!");
		resp.sendRedirect("/Ch01/05Memberjoin.jsp");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//헤더 추가(한글깨짐 방지, Html코드 적용)
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
				
		System.out.println("DoPost!!");
		
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		String addr1 = req.getParameter("addr1");
		String addr2 = req.getParameter("addr2");
		
		try {
			pstmt=conn.prepareStatement("insert into tmp_member values(?,?,?,?)");
			pstmt.setString(1, email);
			pstmt.setString(2, pwd);
			pstmt.setString(3, addr1);
			pstmt.setString(4, addr2);
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("Insert 성공");
				resp.sendRedirect("/Ch01/05Login.jsp");
			}
			else 
			{
				System.out.println("Insert 실패");
				resp.sendRedirect("/Ch01/05Memberjoin.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try{pstmt.close();}catch(Exception e) {}
			
		}
		
	}


	
	@Override
	public void destroy() {
		if(conn!=null)
		{
			try {
				conn.close();
				System.out.println("Conn.close()..");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
}
