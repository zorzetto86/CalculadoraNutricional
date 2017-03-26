package calculadoranutricional.db;

import calculadoranutricional.factory.ManagerDB;
import calculadoranutricional.Paciente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteDB {
    
    ManagerDB conexao = new ManagerDB();
    
    public Paciente getPaciente(String idPaciente){
        try {
            Statement stmt = conexao.abrirConexao().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = stmt.executeQuery("SELECT * FROM paciente p JOIN usuario u ON p.id_usuario = u.id WHERE p.id = " + idPaciente + "; ");
            
            Paciente p = new Paciente();
                
            p.setIdPaciente(result.getInt("p.id"));
            p.setIdade(result.getInt("p.idade"));
            p.setPeso(result.getInt("p.peso"));
            p.setPesoIdeal(result.getFloat("p.pesoideal"));
            p.setAltura(result.getFloat("p.altura"));
            p.setImc(result.getFloat("p.imc"));
            p.setNecessidadeEnergetica(result.getFloat("p.necessidadeenergetica"));
            p.setId_nutricionista(result.getInt("p.id_nutricionista"));
            p.setNaf(result.getFloat("p.naf"));
            p.setId_usuario(result.getInt("p.id_usuario"));
            
            p.setIdUsuario(result.getInt("u.id"));
            p.setTipo(result.getString("u.tipo"));
            p.setUsername(result.getString("u.username"));
            p.setSenha(result.getString("u.senha"));
            p.setNome(result.getString("u.nome"));
            p.setEndereco(result.getString("u.endereco"));
            p.setTelefone(result.getString("u.telefone"));
            p.setEmail(result.getString("u.email"));
            
            conexao.fechaConexao();
            return p;
        }
        catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
            conexao.fechaConexao();
        }
        conexao.fechaConexao();
        return null;
    }
    
    public ArrayList<Paciente> getAllPacientes(){
        
        try {
            Statement stmt = conexao.abrirConexao().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = stmt.executeQuery("SELECT * FROM paciente p JOIN usuario u ON p.id_usuario = u.id");
            
            ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
            while(result.next()){
                Paciente p = new Paciente();
                
                p.setIdPaciente(result.getInt("id"));
                p.setIdade(result.getInt("idade"));
                p.setPeso(result.getInt("peso"));
                p.setPesoIdeal(result.getFloat("pesoideal"));
                p.setAltura(result.getFloat("altura"));
                p.setImc(result.getFloat("imc"));
                p.setNecessidadeEnergetica(result.getFloat("necessidadeenergetica"));
                p.setId_nutricionista(result.getInt("id_nutricionista"));
                p.setNaf(result.getFloat("naf"));
                p.setId_usuario(result.getInt("p.id_usuario"));
            
                p.setIdUsuario(result.getInt("u.id"));
                p.setTipo(result.getString("u.tipo"));
                p.setUsername(result.getString("u.username"));
                p.setSenha(result.getString("u.senha"));
                p.setNome(result.getString("u.nome"));
                p.setEndereco(result.getString("u.endereco"));
                p.setTelefone(result.getString("u.telefone"));
                p.setEmail(result.getString("u.email"));
                
                pacientes.add(p);
            }
            conexao.fechaConexao();
            return pacientes;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
            conexao.fechaConexao();
        }
        conexao.fechaConexao();
        return null;
    }
    
   
     //Insere paciente no banco
      public void insertPaciente(Paciente paciente){
        String query;
        query = " INSERT INTO paciente (idade,peso,pesoideal,altura,imc,necessidadeenergetica,id_nutricionista,naf,id_ususario)  VALUES (" 
                + paciente.getIdade()
                +", "
                + paciente.getPeso()
                +", "
                + paciente.getPesoIdeal()
                +", "
                + paciente.getAltura()
                +", "
                + paciente.getImc()
                +", "
                + paciente.getNecessidadeEnergetica()
                +", "
                + paciente.getId_nutricionista()
                +", "                
                + paciente.getNaf()
                +", "
                + paciente.getId_usuario()
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
