package calculadoranutricional.DBManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import calculadoranutricional.Paciente;
import java.util.ArrayList;
public class ManagerDB {
    private Connection con;
    private final String NOMEBANCO = "jdbc:mysql://localhost:3306/calculadoranutricional";
    private final String NOMEUSUARIO = "root";
    private final String SENHA = "";
    

    public Connection abrirConexao() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(NOMEBANCO, NOMEUSUARIO, SENHA);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
             Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

    public void fechaConexao() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
}
