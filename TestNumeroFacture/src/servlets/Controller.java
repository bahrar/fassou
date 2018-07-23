package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.postgresql.ds.PGPoolingDataSource;

import database.Connect;
/**
 * Servlet implementation class Controller
 */



@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Vector<String> listOfClient = new Vector<String>();
		Connect c = new Connect();
		try{	
				Statement st = c.getConnection().createStatement();
				ResultSet rs = st.executeQuery("select raison_sociale from client ; " );
				while(rs.next()){
				listOfClient.add(rs.getString("raison_sociale"));
				}
			
		}catch(Exception e){
			System.out.println("error "+e.getMessage());
		}
		request.setAttribute("listOfClient", listOfClient);
		this.getServletContext().getRequestDispatcher("/WEB-INF/editerFacture.jsp").forward(request, response);		
	}

}
