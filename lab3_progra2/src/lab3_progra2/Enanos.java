/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_progra2;

import java.util.Date;

/**
 *
 * @author Franklin Garcia
 */
public class Enanos extends Integrante {
    private boolean barba;
    private boolean hacha;
 

    public Enanos() {
        super();
    }

    public Enanos(boolean barba, boolean hacha, String nombre, String Apellido, double altura, Date fecha_nacimiento, Bestia bestia, Double poder, Double ataque, Double defensa, Double curación) {
        super(nombre, Apellido, altura, fecha_nacimiento, bestia, poder, ataque, defensa, curación);
        this.barba = barba;
        this.hacha = hacha;
    }

    public boolean isBarba() {
        return barba;
    }

    public void setBarba(boolean barba) {
        this.barba = barba;
    }

    public boolean isHacha() {
        return hacha;
    }

    public void setHacha(boolean hacha) {
        this.hacha = hacha;
    }


    
}
