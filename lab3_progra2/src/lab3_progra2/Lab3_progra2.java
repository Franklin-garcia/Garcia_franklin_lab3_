/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_progra2;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin Garcia
 */
public class Lab3_progra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion = "";
        ArrayList<Pueblo> lista_pueblo = new ArrayList();
        ArrayList<Bestia> lista_bestias = new ArrayList();
        while (!opcion.equalsIgnoreCase("5")) {
            opcion = JOptionPane.showInputDialog("Ingrese opcion \n"
                    + "1-Agregar \n"
                    + "2-Eliminar \n"
                    + "3-Modificar \n"
                    + "4-Batalla \n"
                    + "5-Salir \n");
            switch (opcion) {
                case "1": {//agregar
                    String opcion1 = JOptionPane.showInputDialog("Ingrese opcion \n"
                            + "1-Agregar pueblos \n"
                            + "2-Agregar lugares \n"
                            + "3-Agregar Integrantes \n"
                            + "4-Agregar bestias");
                    switch (opcion1) {
                        case "1": {//pueblos 
                            String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                            lista_pueblo.add(new Pueblo(nombre));
                            JOptionPane.showMessageDialog(null, "Hecho");
                        }
                        break;
                        case "2": {//lugares
                            String pueblos = "";
                            for (Pueblo p : lista_pueblo) {
                                pueblos += "\n" + lista_pueblo.indexOf(p) + " " + p;
                            }
                            int op = Integer.parseInt(JOptionPane.showInputDialog(pueblos + "\n" + "Ingrese opcion"));
                            String l = JOptionPane.showInputDialog("Ingrese tipo de lugar \n"
                                    + "1-Comarca \n"
                                    + "2-Gondor \n"
                                    + "3-Mordor \n");
                            switch (l) {
                                case "1": {//comarca
                                    int casas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de casas"));
                                    int extension = Integer.parseInt(JOptionPane.showInputDialog("Extension territorio"));
                                    int numero = Integer.parseInt(JOptionPane.showInputDialog("numero de integrantes"));
                                    lista_pueblo.get(op).getLugares().add(new Comarca(casas, extension, numero));
                                    JOptionPane.showMessageDialog(null, "Hecho");
                                }
                                break;
                                case "2": {//Gondor
                                    int parajes = Integer.parseInt(JOptionPane.showInputDialog("Parajes"));
                                    int extension = Integer.parseInt(JOptionPane.showInputDialog("Extension territorio"));
                                    int numero = Integer.parseInt(JOptionPane.showInputDialog("numero de integrantes"));
                                    lista_pueblo.get(op).getLugares().add(new Gondor(parajes, extension, numero));
                                    JOptionPane.showMessageDialog(null, "Hecho");
                                }
                                break;
                                case "3": {//Mordor
                                    int guardianes = Integer.parseInt(JOptionPane.showInputDialog("Numero guardianes"));
                                    int extension = Integer.parseInt(JOptionPane.showInputDialog("Extension territorio"));
                                    int numero = Integer.parseInt(JOptionPane.showInputDialog("numero de integrantes"));
                                    lista_pueblo.get(op).getLugares().add(new Mordor(guardianes, extension, numero));
                                    JOptionPane.showMessageDialog(null, "Hecho");
                                }
                                break;

                            }

                        }
                        break;
                        case "3": {//Integrantes
                            String p = "";
                            for (Pueblo i : lista_pueblo) {
                                p += "\n" + lista_pueblo.indexOf(i) + " " + i;
                            }
                            int pueblo = Integer.parseInt(JOptionPane.showInputDialog(p + "\n" + "Ingrese Opcion de pueblo"));
                            String l = "";
                            for (Lugar i : lista_pueblo.get(pueblo).getLugares()) {
                                l += "\n" + lista_pueblo.get(pueblo).getLugares().indexOf(i) + " " + i;
                            }
                            int lugar = Integer.parseInt(JOptionPane.showInputDialog(l + "\n" + "Ingrese opcion de lugar"));

                            /////////////////////////////////////////////////////////
                            String o = JOptionPane.showInputDialog("Ingrese opcion \n"
                                    + "1-Elfos \n"
                                    + "2-Enanos \n"
                                    + "3-Hobbits \n"
                                    + "4-Hombre \n"
                                    + "5-Maiar \n");
                            switch (o) {
                                case "1": {//Elfos
                                    String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                                    String Apellido = JOptionPane.showInputDialog("Apellido");
                                    double altura = Double.parseDouble(JOptionPane.showInputDialog("altura"));
                                    Date fecha_nacimiento = new Date();
                                    String b = "";
                                    for (Bestia u : lista_bestias) {
                                        b += "\n" + lista_bestias.indexOf(u) + " " + u;
                                    }
                                    int be = Integer.parseInt(JOptionPane.showInputDialog(o + "\n" + "Cual bestia"));
                                    Bestia bestia = lista_bestias.get(be);
                                    double ataque = Double.parseDouble(JOptionPane.showInputDialog("ataque"));

                                    boolean arma = false;
                                    String army = JOptionPane.showInputDialog("Tiene arma \n"
                                            + "1-si \n"
                                            + "2-No \n");
                                    if (army.equals("1")) {
                                        arma = true;
                                        lista_pueblo.get(pueblo).getLugares().get(lugar).getIntegrante().add(new Elfos(
                                                arma, nombre, Apellido, altura, fecha_nacimiento, bestia,
                                                ataque, 443.00 + 10, 150.00 + 10, 335.00 + 10
                                        ));
                                    } else {
                                        arma = false;
                                        lista_pueblo.get(pueblo).getLugares().get(lugar).getIntegrante().add(new Elfos(
                                                arma, nombre, Apellido, altura, fecha_nacimiento, bestia,
                                                ataque, 443.00, 150.00, 335.00
                                        ));
                                    }
                                }
                                JOptionPane.showMessageDialog(null, "Hecho");
                                break;
                                case "2": {//enanos
                                    String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                                    String Apellido = JOptionPane.showInputDialog("Apellido");
                                    double altura = Double.parseDouble(JOptionPane.showInputDialog("altura"));
                                    Date fecha_nacimiento = new Date();
                                    String b = "";
                                    for (Bestia u : lista_bestias) {
                                        b += "\n" + lista_bestias.indexOf(u) + " " + u;
                                    }
                                    int be = Integer.parseInt(JOptionPane.showInputDialog(o + "\n" + "Cual bestia"));
                                    Bestia bestia = lista_bestias.get(be);
                                    double poder = Double.parseDouble(JOptionPane.showInputDialog("poder"));

                                    boolean barba = false;
                                    boolean hacha = false;

                                    Double ataque = 300.00, defensa = 200.00, curacion = 50.00;

                                    String Bar = JOptionPane.showInputDialog("Tiene barba \n"
                                            + "1-Si \n"
                                            + "2-No \n");
                                    if (Bar.equals("1")) {
                                        ataque = ataque + 50;
                                        defensa = defensa + 50;
                                        curacion = curacion + 50;
                                        barba = true;
                                    } else {
                                        barba = false;
                                    }
                                    String ha = JOptionPane.showInputDialog("Tenemos hacha \n"
                                            + "1-si \n"
                                            + "2-No \n");
                                    if (ha.equals("1")) {
                                        ataque = ataque + 50;
                                        defensa = defensa + 50;
                                        curacion = curacion + 50;
                                        hacha = true;
                                    } else {
                                        barba = false;
                                    }
                                    lista_pueblo.get(pueblo).getLugares().get(lugar).getIntegrante().add(
                                            new Enanos(barba, hacha, nombre, Apellido, altura, fecha_nacimiento,
                                                    bestia, poder, ataque, defensa, curacion));
                                    JOptionPane.showMessageDialog(null, "hecho");
                                }
                                break;
                                case "3": {//Hobits
                                    String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                                    String Apellido = JOptionPane.showInputDialog("Apellido");
                                    double altura = Double.parseDouble(JOptionPane.showInputDialog("altura"));
                                    Date fecha_nacimiento = new Date();
                                    String b = "";
                                    for (Bestia u : lista_bestias) {
                                        b += "\n" + lista_bestias.indexOf(u) + " " + u;
                                    }
                                    int be = Integer.parseInt(JOptionPane.showInputDialog(o + "\n" + "Cual bestia"));
                                    Bestia bestia = lista_bestias.get(be);
                                    double poder = Double.parseDouble(JOptionPane.showInputDialog("poder"));

                                    int anillo = Integer.parseInt(JOptionPane.showInputDialog("Numero anillos"));

                                    lista_pueblo.get(pueblo).getLugares().get(lugar).getIntegrante().add(new Hobits(anillo, nombre, Apellido, altura, fecha_nacimiento, bestia,
                                            poder, 10.00 * anillo, 100.00 * anillo, 1.00 * anillo));
                                }
                                break;
                                case "4": {//Hombre
                                    String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                                    String Apellido = JOptionPane.showInputDialog("Apellido");
                                    double altura = Double.parseDouble(JOptionPane.showInputDialog("altura"));
                                    Date fecha_nacimiento = new Date();
                                    String b = "";
                                    for (Bestia u : lista_bestias) {
                                        b += "\n" + lista_bestias.indexOf(u) + " " + u;
                                    }
                                    int be = Integer.parseInt(JOptionPane.showInputDialog(o + "\n" + "Cual bestia"));
                                    Bestia bestia = lista_bestias.get(be);
                                    double poder = Double.parseDouble(JOptionPane.showInputDialog("poder"));

                                    double ataque = 150;
                                    double defensa = 140;
                                    double curación = 50;
                                    int army = Integer.parseInt(JOptionPane.showInputDialog("Arma \n"
                                            + "1-Espada \n"
                                            + "2-Lanza \n"
                                            + "3-arco"));
                                    if (army == 1) {
                                        ataque = ataque + 150;
                                    } else if (army == 2) {
                                        ataque = ataque + 100;
                                    } else if (army == 3) {
                                        ataque = ataque + 50;
                                    }
                                    lista_pueblo.get(pueblo).getLugares().get(lugar).getIntegrante().add(new Hombres());
                                    JOptionPane.showMessageDialog(null, "Hecho");
                                }
                                break;
                                case "5": {//Maiar
                                    String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                                    String Apellido = JOptionPane.showInputDialog("Apellido");
                                    double altura = Double.parseDouble(JOptionPane.showInputDialog("altura"));
                                    Date fecha_nacimiento = new Date();
                                    String b = "";
                                    for (Bestia u : lista_bestias) {
                                        b += "\n" + lista_bestias.indexOf(u) + " " + u;
                                    }
                                    int be = Integer.parseInt(JOptionPane.showInputDialog(o + "\n" + "Cual bestia"));
                                    Bestia bestia = lista_bestias.get(be);
                                    double poder = Double.parseDouble(JOptionPane.showInputDialog("poder"));
                                    double ataque = 150;
                                    double defensa = 140;
                                    double curación = 50;

                                    int sombrero = Integer.parseInt(JOptionPane.showInputDialog("Tiene sombrero \n"
                                            + "1-si \n"
                                            + "2-no \n"));
                                    if (sombrero == 1) {
                                        curación = curación + 200;
                                        ataque = ataque + 200;
                                    }
                                    int baston = Integer.parseInt(JOptionPane.showInputDialog("Tiene baston \n"
                                            + "1-si \n"
                                            + "2-no \n"));
                                    if (baston == 1) {
                                        ataque = ataque + 200;
                                    }
                                    lista_pueblo.get(pueblo).getLugares().get(lugar).getIntegrante().add(new Maiar(baston, sombrero, nombre, Apellido, altura, fecha_nacimiento, bestia, poder, ataque, defensa, curación));
                                    JOptionPane.showMessageDialog(null, "Hecho");
                                }
                                break;
                            }

                        }
                        break;

                        case "4": {//Bestias
                            String op = JOptionPane.showInputDialog("Ingrese opcion \n"
                                    + "1-Aguilas \n"
                                    + "2-Arañas \n"
                                    + "3-Balrogs \n"
                                    + "4-Bestias Aladas \n"
                                    + "5-Dragones \n");

                            switch (op) {//Aguilas
                                case "1": {
                                    int garras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero garras"));
                                    Boolean veneno = false;
                                    String ven = JOptionPane.showInputDialog("Tiene veneno \n"
                                            + "1-Si \n"
                                            + "2-No \n");
                                    if (ven.equals("1")) {
                                        veneno = true;
                                    } else {
                                        veneno = false;
                                    }

                                    int defensa = Integer.parseInt(JOptionPane.showInputDialog("Nivel de defensa"));
                                    int ataque = Integer.parseInt(JOptionPane.showInputDialog("Nivel ataque"));
                                    int vida = Integer.parseInt(JOptionPane.showInputDialog("Vida"));
                                    int curacion = Integer.parseInt(JOptionPane.showInputDialog("Nivel de curacion"));
                                    String color = JOptionPane.showInputDialog("Colo?");
                                    lista_bestias.add(new Aguilas(color, garras, veneno, vida, defensa, ataque, curacion));
                                    JOptionPane.showMessageDialog(null, "Hecho");
                                }
                                break;
                                case "2": {//Arañas
                                    int garras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero garras"));
                                    Boolean veneno = false;
                                    String ven = JOptionPane.showInputDialog("Tiene veneno \n"
                                            + "1-Si \n"
                                            + "2-No \n");
                                    if (ven.equals("1")) {
                                        veneno = true;
                                    } else {
                                        veneno = false;
                                    }

                                    int defensa = Integer.parseInt(JOptionPane.showInputDialog("Nivel de defensa"));
                                    int ataque = Integer.parseInt(JOptionPane.showInputDialog("Nivel ataque"));
                                    int vida = Integer.parseInt(JOptionPane.showInputDialog("Vida"));
                                    int curacion = Integer.parseInt(JOptionPane.showInputDialog("Nivel de curacion"));
                                    String sexo = JOptionPane.showInputDialog("sexo");
                                    lista_bestias.add(new Arañas(sexo, garras, veneno, vida, defensa, ataque, curacion));
                                    JOptionPane.showMessageDialog(null, "Hecho");
                                }
                                break;
                                case "3": {//Balrogs
                                    int garras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero garras"));
                                    Boolean veneno = false;
                                    String ven = JOptionPane.showInputDialog("Tiene veneno \n"
                                            + "1-Si \n"
                                            + "2-No \n");
                                    if (ven.equals("1")) {
                                        veneno = true;
                                    } else {
                                        veneno = false;
                                    }

                                    int defensa = Integer.parseInt(JOptionPane.showInputDialog("Nivel de defensa"));
                                    int ataque = Integer.parseInt(JOptionPane.showInputDialog("Nivel ataque"));
                                    int vida = Integer.parseInt(JOptionPane.showInputDialog("Vida"));
                                    int curacion = Integer.parseInt(JOptionPane.showInputDialog("Nivel de curacion"));
                                    Boolean latigo;
                                    String l = JOptionPane.showInputDialog("Tienen latigo \n"
                                            + "1-si \n"
                                            + "2-no \n");
                                    if (l.equals("1")) {
                                        latigo = true;
                                    } else {
                                        latigo = false;
                                    }
                                    lista_bestias.add(new Balrogs(latigo, garras, veneno, vida, defensa, ataque, curacion));
                                    JOptionPane.showInputDialog("Hecho");
                                }
                                break;
                                case "4": {//Bestias aladas
                                    int garras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero garras"));
                                    Boolean veneno = false;
                                    String ven = JOptionPane.showInputDialog("Tiene veneno \n"
                                            + "1-Si \n"
                                            + "2-No \n");
                                    if (ven.equals("1")) {
                                        veneno = true;
                                    } else {
                                        veneno = false;
                                    }

                                    int defensa = Integer.parseInt(JOptionPane.showInputDialog("Nivel de defensa"));
                                    int ataque = Integer.parseInt(JOptionPane.showInputDialog("Nivel ataque"));
                                    int vida = Integer.parseInt(JOptionPane.showInputDialog("Vida"));
                                    int curacion = Integer.parseInt(JOptionPane.showInputDialog("Nivel de curacion"));
                                    double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad"));
                                    lista_bestias.add(new BestiasAladas(velocidad, garras, veneno, defensa, ataque, vida, curacion));
                                    JOptionPane.showMessageDialog(null, "velocidad");
                                }
                                break;
                                case "5": {//Dragones
                                    int garras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero garras"));
                                    Boolean veneno = false;
                                    String ven = JOptionPane.showInputDialog("Tiene veneno \n"
                                            + "1-Si \n"
                                            + "2-No \n");
                                    if (ven.equals("1")) {
                                        veneno = true;
                                    } else {
                                        veneno = false;
                                    }

                                    int defensa = Integer.parseInt(JOptionPane.showInputDialog("Nivel de defensa"));
                                    int ataque = Integer.parseInt(JOptionPane.showInputDialog("Nivel ataque"));
                                    int vida = Integer.parseInt(JOptionPane.showInputDialog("Vida"));
                                    int curacion = Integer.parseInt(JOptionPane.showInputDialog("Nivel de curacion"));
                                    double long_ala = Double.parseDouble(JOptionPane.showInputDialog("lon ala"));
                                    lista_bestias.add(new Dragones(long_ala, garras, veneno, defensa, ataque, vida, curacion));
                                    JOptionPane.showMessageDialog(null, "hecho");
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                break;

                case "2": {//eliminar
                    String r = JOptionPane.showInputDialog(null, "1-Eliminar Pueblo \n"
                            + "2-Eliminar Bestia"
                    );
                    int re = Integer.parseInt(r);
                    switch (re) {
                        case 1:
                            String resp;
                            int cont = 0;
                            JOptionPane.showMessageDialog(null, "A Continuacion se le muestran los pueblos");
                            for (Pueblo lp : lista_pueblo) {
                                JOptionPane.showMessageDialog(null, "[" + cont + "]" + lp);
                                cont++;
                            }
                            resp = JOptionPane.showInputDialog(null, "Que posicion desea eliminar?");
                            int respp = Integer.parseInt(resp);
                            lista_pueblo.remove(respp);
                            break;

                        case 2:
                            String resp1;
                            int cont1 = 0;
                            JOptionPane.showMessageDialog(null, "A Continuacion se le muestran los pueblos");
                            for (Bestia lp : lista_bestias) {
                                JOptionPane.showMessageDialog(null, "[" + cont1 + "]" + lp);
                                cont1++;
                            }
                            resp1 = JOptionPane.showInputDialog(null, "Que posicion desea eliminar?");
                            int respp1 = Integer.parseInt(resp1);
                            lista_bestias.remove(respp1);
                            break;

                    }

                }
                break;
                case "3": {//modificar

                }
                break;
                case "4": {

                }
                break;
            }
        }

    }
}
