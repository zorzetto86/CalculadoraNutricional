package calculadoranutricional;

public class Nutricionista extends Usuario {
    
    private int idNutricionista;
    private String crn;
    private int id_usuario;

    public int getIdNutricionista() {
        return idNutricionista;
    }

    public void setIdNutricionista(int idNutricionista) {
        this.idNutricionista = idNutricionista;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }
    
        public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
}
