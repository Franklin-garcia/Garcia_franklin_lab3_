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
public class Hombres extends Integrante{
    private int arma;

    public Hombres() {
        super();
    }

    public Hombres(int arma) {
        this.arma = arma;
    }

    public Hombres(int arma, String nombre, String Apellido, double altura, Date fecha_nacimiento, Bestia bestia, Double poder, Double ataque, Double defensa, Double curación) {
        super(nombre, Apellido, altura, fecha_nacimiento, bestia, poder, ataque, defensa, curación);
        this.arma = arma;
    }

    public int getArma() {
        return arma;
    }

    public void setArma(int arma) {
        this.arma = arma;
    }
   
}
