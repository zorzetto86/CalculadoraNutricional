package calculadoranutricional;

import java.util.ArrayList;


public abstract class Dieta {
    protected int id;    
    protected ArrayList<Alimentos> desjejum;
    
    
    public double calcularNecessidadesEnergeticasHomem(Paciente paciente) {
        return 0;
    }
    public double calcularNecessidadesEnergeticasulher(Paciente paciente){
        return 0;
    }
}
