package calculadoranutricional.db;

import calculadoranutricional.*;
import calculadoranutricional.DBManager.ManagerDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AlimentoDietaDB {
    
    ManagerDB conexao = new ManagerDB();
    
    public void insertAlimentoDieta(String id_alimento, String id_dieta, String quantidade){ // como enviar por refeição?
        String query;
        query = " INSERT INTO alimento_dieta (id_alimento, id_dieta, quantidade)  VALUES (" 
                + id_alimento
                +", "
                + id_dieta
                +", "
                + quantidade                
                +");";       
          //System.out.println(query);
              
        try {
            Statement stmt = conexao.abrirConexao().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt.executeUpdate(query);
            conexao.fechaConexao();
        }
        
        catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
            conexao.fechaConexao();
        }
        
    }
    
     public int getQuantidade(AlimentoDieta alimentoDieta){ //tem que pegar na refeição certa       
         String query;
         query = "SELECT quantidade FROM alimentos "
                 + " WHERE id_dieta = " + alimentoDieta.getId_dieta()
                 + " AND id_alimento = " + alimentoDieta.getId()
                 +";";         
                 
        try {
            Statement stmt = conexao.abrirConexao().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = stmt.executeQuery(query);          
           
            alimentoDieta.setQuantidade(result.getInt("quantidade"));
          
            conexao.fechaConexao();
            return alimentoDieta.getQuantidade();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
            conexao.fechaConexao();
        }
        conexao.fechaConexao();
        return 0;
    }
     
      
}
