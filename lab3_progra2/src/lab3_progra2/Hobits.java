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
public class Hobits extends Integrante{
    private int anillo;

    public Hobits() {
    super();
    }

    public Hobits(int anillo, String nombre, String Apellido, double altura, Date fecha_nacimiento, Bestia bestia, Double poder, Double ataque, Double defensa, Double curación) {
        super(nombre, Apellido, altura, fecha_nacimiento, bestia, poder, ataque, defensa, curación);
        this.anillo = anillo;
    }

    public int getAnillo() {
        return anillo;
    }

    public void setAnillo(int anillo) {
        this.anillo = anillo;
    }
    
}
