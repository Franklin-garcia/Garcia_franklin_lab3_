
package lab3_progra2;

public class Aguilas extends Bestia{
    
        private String color;

    public Aguilas() {
    }

    

    public Aguilas(String color, int garras, boolean veneno, int vida, int defensa, int ataque, int curacion) {
        super(garras, veneno, vida, defensa, ataque, curacion);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
}
