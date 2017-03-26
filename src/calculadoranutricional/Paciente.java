package calculadoranutricional;

public class Paciente extends Usuario {
    //private int idPaciente;
    private int id_usuario;
    private int idade;
    private float peso;
    private float pesoIdeal;
    private float altura;
    private float imc;
    private float necessidadeEnergetica;
    //private int id_nutricionista;    
    private float naf;
    private boolean doente; // add
    private char sexo; // add -será M ou F
    private int id_dieta; // add
    


    /*public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }*/

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(float pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

   /* public int getId_nutricionista() {
        return id_nutricionista;
    }

    public void setId_nutricionista(int id_nutricionista) {
        this.id_nutricionista = id_nutricionista;
    }*/
    
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public float getNaf() {
        return naf;
    }

    public void setNaf(float naf) {
        this.naf = naf;
    }

    public float getNecessidadeEnergetica() {
        return necessidadeEnergetica;
    }

    public void setNecessidadeEnergetica(float necessidadeEnergetica) {
        this.necessidadeEnergetica = necessidadeEnergetica;
    } 

    public boolean isDoente() {
        return doente;
    }

    public void setDoente(boolean doente) {
        this.doente = doente;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getId_dieta() {
        return id_dieta;
    }

    public void setId_dieta(int id_dieta) {
        this.id_dieta = id_dieta;
    }
    
    
}