
package calculadoranutricional.servicos;

import calculadoranutricional.*;

public class PacienteServicos {
       
    public  float calcularImc(Paciente pct){
        float imc;
        imc = pct.getPeso() / (pct.getAltura() * pct.getAltura());        
        return imc;
    }
    
    public float getPeso(Paciente paciente){
       PacienteServicos pct = new PacienteServicos();
       float peso;
       if(paciente.getImc() > 24.9 || paciente.getImc() < 18.5){
           peso = pct.calcularPesoIdeal(paciente);
       } else {
           peso = paciente.getPeso();
       }
       return peso;
   }
    
      public  float calcularPesoIdeal(Paciente pct){
        float pesoIdeal;
        pesoIdeal = 22 * pct.getAltura() * pct.getAltura(); // Pois 22 é o IMC médio, sendo uma maneira utilizada por nutricionistas para calcular o peso ideal
        return pesoIdeal;
    }
    
   
}
