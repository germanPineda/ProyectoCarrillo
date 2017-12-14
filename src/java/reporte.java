import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/reporte")
public class reporte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reporte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			DBConexion conectar = new DBConexion();
			Statement sentencia = (Statement) conectar.conexion.createStatement();
			
			String sql = "SELECT * FROM alumno;";
			ResultSet rs = sentencia.executeQuery(sql);
			String control = "";
                        
			while(rs.next()) {
                                control = rs.getString("NoControl");
                                String nombres = rs.getString("nombres");
                                String apellidos = rs.getString("apellidos");
                                String birthDay = rs.getString("fechaNacimiento");
                                String iniPeriod = rs.getString("periodoinicial");
                                String idGroup = rs.getString("grupo_idgrupo");
			}
			request.setAttribute("control", control);
                        getServletContext().getRequestDispatcher("/alumno.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
