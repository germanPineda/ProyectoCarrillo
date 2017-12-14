import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBConexion {

	Connection conexion = null;
	
	public DBConexion() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Encontrado");
			
			String url  = "jdbc:mysql://localhost/db_escuela";
			String user = "root";
			String pass = "";
			
			conexion = (Connection) DriverManager.getConnection(url, user, pass);
			
		}catch(ClassNotFoundException e) {
			System.err.println("Driver not found: "+e.getMessage());
		}catch(SQLException e) {
			System.err.println("No conectado: "+e.getMessage());
		}

	}

}
