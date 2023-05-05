
package entities;

public class Elemento extends Instrumento{
 private String elemento;

    public Elemento(String elemento, String tipo, int codigo, String nome, double preco) {
        super(tipo, codigo, nome, preco);
        this.elemento = elemento;
    }
    public String getMaterial() {
        return elemento;
    }
    public void setMaterial(String Elemento) {
        this.elemento = elemento;
    } 
    @Override
        public String toString(){
            return "Elemento: " + elemento;
        }
}