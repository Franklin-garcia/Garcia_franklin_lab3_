
package lab3_progra2;


public class Dragones extends Bestia{

    private double long_ala;
    
    public Dragones() {
    }

    public Dragones(double long_ala) {
        this.long_ala = long_ala;
    }

    public Dragones(double long_ala, int garras, Boolean veneno, int defensa, int ataque, int vida, int curacion) {
        super(garras, veneno, defensa, ataque, vida, curacion);
        this.long_ala = long_ala;
    }

    public double getLong_ala() {
        return long_ala;
    }

    public void setLong_ala(double long_ala) {
        this.long_ala = long_ala;
    }
    
}
