package calculadoranutricional.db;

import calculadoranutricional.Paciente;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PacienteDB extends ManagerDB{
     ManagerDB conexao = new ManagerDB();
     
     //Retorna o nome de todos os pacientes
     public ArrayList<Paciente> getAllPacientes(){
        
        try {            
            Statement stmtTodosPacientes = this.abrirConexao().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = stmtTodosPacientes.executeQuery("SELECT * FROM usuario WHERE tipo = 1; ");
            
            while(result.next()){
                System.out.println(result.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
   
     //Insere pacientes no banco
      public void insertPacientes(Paciente paciente){
        String query;
        query = " insert into paciente (idade, peso, pesoIdeal, altura, naf, necessidadesEnergeticas)  values (" 
                + paciente.getIdade()
                +", "
                + paciente.getPeso()
                +", "
                + paciente.getPesoIdeal()
                +", "
                + paciente.getAltura()
                +", "
                + paciente.getNaf()
                +", "
                + paciente.getNecessidadeEnergetica()
                +") ";       
          System.out.println(query);
              
        try {            
            Statement stmtTodosPacientes = this.abrirConexao().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmtTodosPacientes.executeUpdate(query);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
