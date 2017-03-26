package calculadoranutricional;

import java.util.ArrayList;


public abstract class Dieta {
    protected int id;      
    protected ArrayList<AlimentoDieta> alimentoDieta;
    
    
    public abstract double calcularNecessidadesEnergeticasHomem(Paciente paciente);
   
    public abstract double calcularNecessidadesEnergeticasMulher(Paciente paciente);
   
}
