
package calculadoranutricional.db;

import calculadoranutricional.Alimentos;
import calculadoranutricional.Nutricionista;
import calculadoranutricional.DBManager.ManagerDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AlimentoDB {
    
    ManagerDB conexao = new ManagerDB();
    
    public void insertAlimento(Alimentos alimento){
        String query;
        query = " INSERT INTO alimentos (nome, calorias, proteina, carboidrato, lipideo, ferro, sodio, colesterol, fibra)  VALUES (" 
                + alimento.getNome()
                +", "
                + alimento.getCalorias()
                +", "
                + alimento.getProteina()
                +", "
                + alimento.getCarboidrato()
                +", "
                + alimento.getLipideo()
                +", "
                + alimento.getFerro()
                +", "
                + alimento.getSodio()
                +", "
                + alimento.getColesterol()
                +", "
                + alimento.getFibra()                 
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
    
     public ArrayList<Alimentos> getAllAlimentos(){        
        try {
            Statement stmt = conexao.abrirConexao().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = stmt.executeQuery("SELECT * FROM alimentos;");
            
            ArrayList<Alimentos> alimentos = new ArrayList<Alimentos>();
            
            while(result.next()){
                Alimentos a = new Alimentos();
                
                a.setNome(result.getString("nome"));
                a.setCalorias(result.getInt("calorias"));
                a.setProteina(result.getInt("proteina"));
                a.setCarboidrato(result.getInt("carboidrato"));                
                a.setLipideo(result.getInt("lipideo"));
                a.setFerro(result.getInt("ferro"));
                a.setSodio(result.getInt("sodio"));
                a.setColesterol(result.getInt("colesterol"));             
                a.setFibra(result.getInt("fibra"));
         
                alimentos.add(a);
            }
            conexao.fechaConexao();
            return alimentos;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
            conexao.fechaConexao();
        }
        conexao.fechaConexao();
        return null;
    }
     
      public void editAlimento(String valorAnterior, String novoValor, String coluna){
        String query;
        query = " UPDATE alimentos"
                + " SET " + coluna + " = " + novoValor
                + " WHERE " + coluna + " = " + valorAnterior + ";";              
              
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
      
        public void deleteAlimento(String valor, String coluna){
        String query;
        query = " DELETE FROM alimentos"               
                + " WHERE " + coluna + " = " + valor + ";";              
              
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
    
    /*
    insert ok
     get ok
    update ok
    delete
    */
}
