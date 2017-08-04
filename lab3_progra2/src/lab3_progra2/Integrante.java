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
public class Integrante {

    private String nombre;
    private String Apellido;
    private double altura;
    private Date fecha_nacimiento;
    private Bestia bestia;
    private Double poder;
    private Double ataque;
    private Double defensa;
    private Double curación;
    
    public Integrante() {
    }

    public Integrante(String nombre, String Apellido, double altura, Date fecha_nacimiento, Bestia bestia, Double poder, Double ataque, Double defensa, Double curación) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.altura = altura;
        this.fecha_nacimiento = fecha_nacimiento;
        this.bestia = bestia;
        this.poder = poder;
        this.ataque = ataque;
        this.defensa = defensa;
        this.curación = curación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Bestia getBestia() {
        return bestia;
    }

    public void setBestia(Bestia bestia) {
        this.bestia = bestia;
    }

    public Double getPoder() {
        return poder;
    }

    public void setPoder(Double poder) {
        this.poder = poder;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public Double getDefensa() {
        return defensa;
    }

    public void setDefensa(Double defensa) {
        this.defensa = defensa;
    }

    public Double getCuración() {
        return curación;
    }

    public void setCuración(Double curación) {
        this.curación = curación;
    }

}
