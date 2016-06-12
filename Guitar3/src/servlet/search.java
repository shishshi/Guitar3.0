package servlet;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IGuitar;
import dao.dataAccess;
import model.GuitarSpec;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GuitarSpec spec = new GuitarSpec(null, null, null, null);
		spec.setBuilder(request.getParameter("builder"));
		spec.setModel(request.getParameter("model"));
		spec.setType(request.getParameter("type"));
		spec.setWood(request.getParameter("wood"));
		
		List matchingGuitars = new LinkedList();
		IGuitar i = dataAccess.createGuitarDao();
		matchingGuitars = i.inventory().search(spec);

		//System.out.println(matchingGuitars);

		request.setAttribute("matchingGuitars", matchingGuitars);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
