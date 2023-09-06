package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join")
public class Join extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Join() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("joinCode", "yes");
		
		//요청된 위치로 데이터를 전달하며 해당 url로 이동하게 만들어주는 객체 - requestDispatcher
		RequestDispatcher req = request.getRequestDispatcher("views/login/join.jsp");
		req.forward(request, response); //요청위치로 req, resp객체에 담긴 데이터 전달 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
