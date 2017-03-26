package calculadoranutricional;
import java.util.ArrayList;
import calculadoranutricional.servicos.*;

public class DietaDoente extends Dieta{
  ArrayList<Alimentos> alimentos;
  PacienteServicos  pctServico = new PacienteServicos();
   
    public double calcularNecessidadesEnergeticasHomem (Paciente paciente){
       float peso = pctServico.getPeso(paciente);
       double necessidadeEnergetica;     
       
       necessidadeEnergetica = (66.47 + (13.75 * peso) + (5 * paciente.getAltura()) - (6.76 * paciente.getIdade()))
               * paciente.getNaf() * 1.3;
       
       return necessidadeEnergetica; 
   }
   
   public double calcularNecessidadesEnergeticasMulher (Paciente paciente){
       float peso = pctServico.getPeso(paciente);
       double necessidadeEnergetica;
       
       necessidadeEnergetica = (655.51 + (9.56 * peso) + (1.85 * paciente.getAltura()) - (4.68 * paciente.getIdade()))
             * paciente.getNaf() * 1.3;  
        
       return necessidadeEnergetica; 
   }
    
}
