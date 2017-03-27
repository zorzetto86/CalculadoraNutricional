package calculadoranutricional;


import calculadoranutricional.db.PacienteDB;


public class CalculadoraNutricional {

   
    public static void main(String[] args) {
        
        //classe para testes
       PacienteDB banco = new PacienteDB();  
        
        Paciente pct = new Paciente();
        pct.setAltura(1.7f);
        pct.setIdade(21);
        pct.setImc(19);
        pct.setNaf(1);
        pct.setNecessidadeEnergetica(2000);
        pct.setPeso(56);
        //banco.insertPacientes(pct);
        
               
        banco.getAllPacientes();
        
    }
    
}
