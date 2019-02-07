package controller;

import java.io.IOException;
import java.text.ParseException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Day;

/**
 * Servlet implementation class getDayServlet
 */
@WebServlet("/getDayServlet")
public class getDayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userDate = request.getParameter("userDate");
		Day uDay;
		try {
			uDay = new Day(userDate);
			uDay.setDate(userDate);
			request.setAttribute("userDay", uDay);
			getServletContext().getRequestDispatcher("/resultDayCalculator.jsp").forward(request, response);
			//PrintWriter writer = response.getWriter();
			//writer.println(uDay.toString());
			//writer.close();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
