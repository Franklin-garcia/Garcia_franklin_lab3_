/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_progra2;

import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class Lugar {
 private int extension;
 private int integrantes;
 private ArrayList<Integrante>integrante=new ArrayList();

    public Lugar() {
    }

    public Lugar(int extension, int integrantes) {
        this.extension = extension;
        this.integrantes = integrantes;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    public ArrayList<Integrante> getIntegrante() {
        return integrante;
    }

    public void setIntegrante(ArrayList<Integrante> integrante) {
        this.integrante = integrante;
    }
 
}
