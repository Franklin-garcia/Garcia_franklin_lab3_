/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_progra2;

/**
 *
 * @author Franklin Garcia
 */
public class Mordor extends Lugar{
    private int guardianes;

    public Mordor() {
        super();
        
    }

    public Mordor(int guardianes, int extension, int integrantes) {
        super(extension, integrantes);
        this.guardianes = guardianes;
    }

    public int getGuardianes() {
        return guardianes;
    }

    public void setGuardianes(int guardianes) {
        this.guardianes = guardianes;
    }
     
}
