package calculadoranutricional;

import calculadoranutricional.db.ManagerDB;


public class CalculadoraNutricional {

   
    public static void main(String[] args) {
        
        ManagerDB banco = new ManagerDB();
        
        banco.getAllPacientes();
    }
    
}
