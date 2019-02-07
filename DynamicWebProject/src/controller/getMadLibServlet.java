package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Day;
import model.MadLib;

/**
 * Servlet implementation class getMadLibServlet
 */
@WebServlet("/getMadLibServlet")
public class getMadLibServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMadLibServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userProperNoun = request.getParameter("userProperNoun");
		String userVerb = request.getParameter("userVerb");
		String userAdjective = request.getParameter("userAdjective");
		String userNoun = request.getParameter("userNoun");
		String userTransportation = request.getParameter("userTransportation");
		MadLib uMad = new MadLib();
		uMad.setProperNoun(userProperNoun);
		uMad.setVerb(userVerb);
		uMad.setAdjective(userAdjective);
		uMad.setNoun(userNoun);
		uMad.setTransportation(userTransportation);
		request.setAttribute("userMadLib", uMad);
		getServletContext().getRequestDispatcher("/resultMadLib.jsp").forward(request, response);
	}

}
