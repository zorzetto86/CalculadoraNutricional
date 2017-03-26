package calculadoranutricional.db;

import calculadoranutricional.factory.ManagerDB;
import calculadoranutricional.Nutricionista;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NutricionistaDB {
    
    ManagerDB conexao = new ManagerDB();
    
    public Nutricionista getNutricionista(String idNutricionista){
        try {
            Statement stmt = conexao.abrirConexao().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = stmt.executeQuery("SELECT * FROM nutricionista n JOIN usuario u ON n.id_usuario = u.id WHERE n.id = " + idNutricionista + "; ");
            
            Nutricionista n = new Nutricionista();
                
            n.setIdNutricionista(result.getInt("n.id"));
            n.setCrn(result.getString("n.crn"));
            n.setId_usuario(result.getInt("id_usuario"));
            
            n.setIdUsuario(result.getInt("u.id"));
            n.setTipo(result.getString("u.tipo"));
            n.setUsername(result.getString("u.username"));
            n.setSenha(result.getString("u.senha"));
            n.setNome(result.getString("u.nome"));
            n.setEndereco(result.getString("u.endereco"));
            n.setTelefone(result.getString("u.telefone"));
            n.setEmail(result.getString("u.email"));
            
            conexao.fechaConexao();
            return n;
        }
        catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
            conexao.fechaConexao();
        }
        conexao.fechaConexao();
        return null;
    }
    
    public ArrayList<Nutricionista> getAllNutricionistas(){
        
        try {
            Statement stmt = conexao.abrirConexao().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = stmt.executeQuery("SELECT * FROM nutricionista n JOIN usuario u ON n.id_usuario = u.id");
            
            ArrayList<Nutricionista> nutricionistas = new ArrayList<Nutricionista>();
            while(result.next()){
                Nutricionista n = new Nutricionista();
                
                n.setIdNutricionista(result.getInt("id"));
                n.setCrn(result.getString("crn"));
                n.setId_usuario(result.getInt("id_usuario"));
                
                n.setIdUsuario(result.getInt("u.id"));
                n.setTipo(result.getString("u.tipo"));
                n.setUsername(result.getString("u.username"));
                n.setSenha(result.getString("u.senha"));
                n.setNome(result.getString("u.nome"));
                n.setEndereco(result.getString("u.endereco"));
                n.setTelefone(result.getString("u.telefone"));
                n.setEmail(result.getString("u.email"));
            
                nutricionistas.add(n);
            }
            conexao.fechaConexao();
            return nutricionistas;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
            conexao.fechaConexao();
        }
        conexao.fechaConexao();
        return null;
    }
    
   
     //Insere nutricionista no banco
      public void insertNutricionista(Nutricionista nutricionista){
        String query;
        query = " INSERT INTO nutricionista (crn,id_usuario)  VALUES (" 
                + nutricionista.getCrn()
                +", "
                + nutricionista.getId_usuario()
                +");";       
          System.out.println(query);
              
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
    
}
