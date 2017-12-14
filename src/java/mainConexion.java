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
@WebServlet("/mainConexion")
public class mainConexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mainConexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String requestUser = request.getParameter("user");
                String control = "";
                String nombres = "";
                String apellidos = "";
                String feN = "";
                String perIn = "";
                try{
                DBConexion conectar = new DBConexion();
                Statement sentencia = (Statement) conectar.conexion.createStatement();

                String sql = "SELECT * FROM alumno WHERE NoControl =" +requestUser+";";
                ResultSet rs = sentencia.executeQuery(sql);
                while(rs.next()) {
                    control = rs.getString("NoControl");
                    nombres = rs.getString("nombres");
                    apellidos = rs.getString("apellidos");
                    feN = rs.getString("fechaNacimiento");
                    perIn = rs.getString("periodoInicial");
                }
                request.setAttribute("control", control);
                request.setAttribute("nombres", nombres);
                request.setAttribute("apellidos", apellidos);
                request.setAttribute("feN", feN);
                request.setAttribute("perIn", perIn);
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
