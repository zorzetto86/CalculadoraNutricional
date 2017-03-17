package calculadoranutricional;

public class Paciente {
    private int id;
    private int idade;
    private float peso;
    private float pesoIdeal;
    private float altura;
    private float imc;
    private float necessidadeEnergetica;
    private int id_nutricionista;
    private float naf;
    
    
    
    
    /*
    Atributos: id, idade, peso, pesoideal, altura, nutricionista , naf              	
                                           	Metodos: getters e setters, calcularIMC
    
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getId_nutricionista() {
        return id_nutricionista;
    }

    public void setId_nutricionista(int id_nutricionista) {
        this.id_nutricionista = id_nutricionista;
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
    
    
    
    public float calcularImc(){
        return 1;
    }
    
    public float calcularPesoIdeal(){
        return 1;
    }
}
