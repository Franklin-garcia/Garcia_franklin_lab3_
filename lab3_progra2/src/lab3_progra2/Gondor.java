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
public class Gondor extends Lugar{
    private int parajes;

    public Gondor() {
        super();
    }

    public Gondor(int parajes, int extension, int integrantes) {
        super(extension, integrantes);
        this.parajes = parajes;
    }

    public int getParajes() {
        return parajes;
    }

    public void setParajes(int parajes) {
        this.parajes = parajes;
    }
    
}
