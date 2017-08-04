
package lab3_progra2;


public class Arañas extends Bestia{
    
    private String sexo;

    public Arañas() {
    }

    public Arañas(String sexo) {
        this.sexo = sexo;
    }

    public Arañas(String sexo, int garras, boolean veneno, int vida, int defensa, int ataque, int curacion) {
        super(garras, veneno, vida, defensa, ataque, curacion);
        
        this.sexo = sexo;
        if (sexo.equals("femenino")) {
            vida+=50;
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Araña" + super.toString();
    }


}
