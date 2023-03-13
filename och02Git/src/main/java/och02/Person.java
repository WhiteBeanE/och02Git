package och02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Person
 */
@WebServlet("/Person")
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String notice[] = request.getParameterValues("notice");
		// 배열 값을 받음
		String job = request.getParameter("job");
		out.print("<html><body>");
		out.print("<h1>개인정보</h1>");
		out.print("이름 : " + name +"<br>");
		out.print("아이디 : " + id +"<br>");
		out.print("암호 : " + password +"<br>");
		out.print("성별 : " + gender +"<br>");
		String mail ="";
		for(int i = 0; i < notice.length; i++) {
			mail += notice[i]+" ";
		}
		out.print("수신메일 : "+ mail +"<br>");
		out.print("직업 : " + job +"<br>");
		out.print("</body></html>");
		out.close();

	}

}
