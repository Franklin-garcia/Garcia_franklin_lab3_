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
public class Maiar extends Integrante{
   private int baston;

    public Maiar() {
        super();
    }

    public Maiar(int baston, String nombre, String Apellido, double altura, Date fecha_nacimiento, Bestia bestia, Double poder, Double ataque, Double defensa, Double curación) {
        super(nombre, Apellido, altura, fecha_nacimiento, bestia, poder, ataque, defensa, curación);
        this.baston = baston;
    }

    public int getBaston() {
        return baston;
    }

    public void setBaston(int baston) {
        this.baston = baston;
    }
   
}
