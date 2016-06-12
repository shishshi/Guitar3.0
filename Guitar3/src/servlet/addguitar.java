package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IGuitar;
import dao.dataAccess;
import model.Guitar;
import model.GuitarSpec;

/**
 * Servlet implementation class addguitar
 */
@WebServlet("/addguitar")
public class addguitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addguitar() {
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
		int id= Integer.parseInt(request.getParameter("id").toString());
	    double price=Double.valueOf(request.getParameter("price").toString());
	    
	    IGuitar i = dataAccess.createGuitarDao();
	    i.addGuitar(id,price,spec);

	    request.getRequestDispatcher("addguitar.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
