package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Logout() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate(); // 세션 종료(즉시 제거)
		
		//비회원이 접근할 수 있는 메인 페이지로 이동시키기
//		response.sendRedirect("/"); //새로운 url로  이동 요청, root기입시 404에러 발생되므로
		response.sendRedirect(request.getContextPath()); //contextroot정보 얻음 >> 하위 default페이지인 index.jsp로 이동시킴
	}
}
