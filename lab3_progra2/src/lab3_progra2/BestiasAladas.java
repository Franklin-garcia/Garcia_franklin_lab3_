
package lab3_progra2;


public class BestiasAladas extends Bestia{
    private double velocidad;

    public BestiasAladas() {
    }

    public BestiasAladas(double velocidad) {
        this.velocidad = velocidad;
    }

    public BestiasAladas(double velocidad, int garras, Boolean veneno, int defensa, int ataque, int vida, int curacion) {
        super(garras, veneno, defensa, ataque, vida, curacion);
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
  public String toString() {
        return "Bestia Alada" + super.toString();
    }
  
    
}
