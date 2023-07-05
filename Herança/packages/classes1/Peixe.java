package classes;

public class Peixe extends Animal {

    private String tipoHabitat;
    
    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }
    
    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
    
    public String getTipoHabitat() {
        return tipoHabitat;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nTipo de Habitat: " + tipoHabitat;
    }
}
