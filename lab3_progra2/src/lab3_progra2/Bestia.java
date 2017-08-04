package lab3_progra2;

import javax.swing.JOptionPane;

public class Bestia {

    private int garras;
    private Boolean veneno;
    private int defensa;
    private int ataque;
    private int vida;
    private int curacion;

    public Bestia() {
    }

    public Bestia(int garras, Boolean veneno, int defensa, int ataque, int vida, int curacion) {
        this.garras = garras;
        this.veneno = veneno;
        this.defensa = defensa;
        this.ataque = ataque;
        this.vida = vida;
        this.curacion = curacion;
    }

    public int getGarras() {
        return garras;
    }

    public void setGarras(int garras) {
        if (garras<=6) {
             this.garras = garras;
        }else {
        JOptionPane.showMessageDialog(null, "Como maximo se aceptan 6 garras");
        }
    }

    public Boolean getVeneno() {
        return veneno;
    }

    public void setVeneno(Boolean veneno) {
        this.veneno = veneno;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida>=50 && vida <=150) {
             this.vida = vida;
        }else {
            JOptionPane.showMessageDialog(null, "La vida debe ser mayor a 50 y menor a 150");
        }
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    @Override
    public String toString() {
        return "Bestia{" + "garras=" + garras + ", veneno=" + veneno + ", defensa=" + defensa + ", ataque=" + ataque + ", vida=" + vida + ", curacion=" + curacion + '}';
    }
    
}
