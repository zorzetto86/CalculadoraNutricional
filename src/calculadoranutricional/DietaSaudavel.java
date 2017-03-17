package calculadoranutricional;

public class DietaSaudavel {
   //Paciente paciente = new Paciente();
   
   public double calcularNecessidadesEnergeticasHomem (Paciente paciente){
       float peso = getPeso(paciente);
       double necessidadeEnergetica;     
       
       necessidadeEnergetica = 293 - (3.8 * paciente.getIdade()) + (456.4 * paciente.getAltura()) + (10.12 * peso);
        //salvar no banco o valor das nee
       return necessidadeEnergetica; 
   }
   
   public double calcularNecessidadesEnergeticasMulher (Paciente paciente){
       float peso = getPeso(paciente);
       double necessidadeEnergetica;
       
       necessidadeEnergetica = 247 - (2.47 * paciente.getIdade()) + (401.5 * paciente.getAltura()) + (8.6 * peso);
        //salvar no banco o valor das nee
       return necessidadeEnergetica; 
   }
   
   public float getPeso(Paciente paciente){
       float peso;
       if(paciente.getImc() > 24.9 || paciente.getImc() < 18.5){
           peso = paciente.calcularPesoIdeal();
       } else {
           peso = paciente.getPeso();
       }
       return peso;
   }
}
