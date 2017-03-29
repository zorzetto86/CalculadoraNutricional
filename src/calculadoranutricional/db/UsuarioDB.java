package calculadoranutricional.db;

import calculadoranutricional.DBManager.ManagerDB;
import calculadoranutricional.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDB {
    
    ManagerDB conexao = new ManagerDB();
    
    public Usuario getUsuario(String idUsuario){
        try {
            Statement stmt = conexao.abrirConexao().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = stmt.executeQuery("SELECT * FROM usuario WHERE tipo 1 AND id = " + idUsuario + "; ");
            
            Usuario u = new Usuario();
                
            u.setIdUsuario(result.getInt("id"));
            u.setTipo(result.getString("tipo"));
            u.setUsername(result.getString("username"));
            u.setSenha(result.getString("senha"));
            u.setNome(result.getString("nome"));
            u.setEndereco(result.getString("endereco"));
            u.setTelefone(result.getString("telefone"));
            u.setEmail(result.getString("email"));
            
            conexao.fechaConexao();
            return u;
        }
        catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
            conexao.fechaConexao();
        }
        conexao.fechaConexao();
        return null;
    }
    
    public ArrayList<Usuario> getAllUusuarios(){
        
        try {
            Statement stmt = conexao.abrirConexao().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = stmt.executeQuery("SELECT * FROM usuario WHERE tipo 1; ");
            
            ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
            while(result.next()){
                Usuario u = new Usuario();
                
                u.setIdUsuario(result.getInt("id"));
                u.setTipo(result.getString("tipo"));
                u.setUsername(result.getString("username"));
                u.setSenha(result.getString("senha"));
                u.setNome(result.getString("nome"));
                u.setEndereco(result.getString("endereco"));
                u.setTelefone(result.getString("telefone"));
                u.setEmail(result.getString("email"));
                usuarios.add(u);
            }
            conexao.fechaConexao();
            return usuarios;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
            conexao.fechaConexao();
        }
        conexao.fechaConexao();
        return null;
    }
    
   
     //Insere usuario no banco
      public void insertUsuario(Usuario usuario){
        String query;
        query = " INSERT INTO usuario (tipo, username, senha, nome, endereco, telefone, email)  VALUES (" 
                + usuario.getTipo()
                +", "
                + usuario.getUsername()
                +", "
                + usuario.getSenha()
                +", "
                + usuario.getNome()
                +", "
                + usuario.getEndereco()
                +", "
                + usuario.getTelefone()
                +", "
                + usuario.getEmail()
                +") ";       
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
