package calculadoranutricional;
import calculadoranutricional.servicos.*;

public class DietaSaudavel extends Dieta{
   PacienteServicos  pctServico = new PacienteServicos();
   
   public double calcularNecessidadesEnergeticasHomem (Paciente paciente){
       float peso = pctServico.getPeso(paciente);
       double necessidadeEnergetica;     
       
       necessidadeEnergetica = 293 - (3.8 * paciente.getIdade()) + (456.4 * paciente.getAltura()) + (10.12 * peso);
        
       return necessidadeEnergetica; 
   }
   
   public double calcularNecessidadesEnergeticasMulher (Paciente paciente){
       float peso = pctServico.getPeso(paciente);
       double necessidadeEnergetica;
       
       necessidadeEnergetica = 247 - (2.47 * paciente.getIdade()) + (401.5 * paciente.getAltura()) + (8.6 * peso);
        
       return necessidadeEnergetica; 
   }
   
   
}
