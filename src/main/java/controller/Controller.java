package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.checkLogin;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {

	final private String errorPage = "fail.jsp";

	final private String homePage = "index.jsp";

	final private String welcomePage = "welcome.jsp";

	final private String registerPage = "register.jsp";

	final private String showPage = "show.jsp";

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("view/login.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String action = request.getParameter("btAction");
			if (action.equals("Login")) {
				String username = request.getParameter("txtUsername");
				String password = request.getParameter("txtPass");
				checkLogin checklogin = new checkLogin();
				String url = errorPage;
				if (checklogin.checkLogin(username, password)) {
					HttpSession session = request.getSession(true);
					session.setAttribute("USER", username);
					url = welcomePage;
				}
				RequestDispatcher rd = request.getRequestDispatcher("view/" + url);
				rd.forward(request, response);
			} else if (action.equals("tryAgain")) {
				RequestDispatcher rd = request.getRequestDispatcher(homePage);
				rd.forward(request, response);
			}

//		doGet(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
