
package lab3_progra2;



public class Balrogs extends Bestia{
    
    private Boolean latigo;

    public Balrogs() {
    }

    public Balrogs(Boolean latigo) {
        this.latigo = latigo;
    }

    public Balrogs(Boolean latigo, int garras, boolean veneno, int vida, int defensa, int ataque, int curacion) {
        super(garras, veneno, vida, defensa, ataque, curacion);
        this.latigo = latigo;
    }

    public Boolean getLatigo() {
        return latigo;
    }

    public void setLatigo(Boolean latigo) {
        this.latigo = latigo;
    }
    
    
}
