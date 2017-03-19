package calculadoranutricional.db;
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
    

    public ManagerDB() throws IllegalAccessException {
        try {
           // Class.forName("sun.jdbc.driver.JdbcOdbcDriver");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<Paciente> getAllPacientes(){
        try {
            this.con = DriverManager.getConnection(NOMEBANCO, NOMEUSUARIO, SENHA);
            Statement stmtTodosPacientes = this.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = stmtTodosPacientes.executeQuery("SELECT * FROM usuario WHERE tipo = 1; ");
            
            while(result.next()){
                System.out.println(result.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
}
