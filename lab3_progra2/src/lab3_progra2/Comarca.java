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
public class Comarca extends Lugar {

    private boolean hobbit;
    private int casas;

    public Comarca() {
        super();
    }

    public Comarca(boolean hobbit, int casas, int extension, int integrantes) {
        super(extension, integrantes);
        this.hobbit = hobbit;
        this.casas = casas;
    }

    public boolean isHobbit() {
        return hobbit;
    }

    public void setHobbit(boolean hobbit) {
        this.hobbit = hobbit;
    }

    public int getCasas() {
        return casas;
    }

    public void setCasas(int casas) {
        this.casas = casas;
    }

}
