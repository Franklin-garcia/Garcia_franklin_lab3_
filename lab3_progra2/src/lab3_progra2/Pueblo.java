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
public class Pueblo {
  private ArrayList<Lugar>lugares=new ArrayList();
  private String nombre;
    public Pueblo() {
    }

    public Pueblo(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(ArrayList<Lugar> lugares) {
        this.lugares = lugares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
