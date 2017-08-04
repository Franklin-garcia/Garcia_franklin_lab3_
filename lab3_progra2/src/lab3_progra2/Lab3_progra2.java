/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_progra2;

import java.util.ArrayList;
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
                        }
                        break;
                        case "4": {//Bestias

                        }
                        break;
                    }
                }
                break;
                case "2": {//eliminar
                    String r=JOptionPane.showInputDialog(null, "1-Eliminar Pueblo \n"
                            + "2-Eliminar Bestia"
                    );
                    int re=Integer.parseInt(r);
                    switch(re){
                        case 1:
                            String resp;
                            int cont=0;
                            JOptionPane.showMessageDialog(null, "A Continuacion se le muestran los pueblos");
                            for (Pueblo lp : lista_pueblo) {
                                JOptionPane.showMessageDialog(null, "["+cont+"]"+lp );
                                cont++;
                            }
                            resp=JOptionPane.showInputDialog(null, "Que posicion desea eliminar?" );
                            int respp=Integer.parseInt(resp);
                            lista_pueblo.remove(respp);
                            break;
                            
                        case 2:
                            String resp1;
                            int cont1=0;
                            JOptionPane.showMessageDialog(null, "A Continuacion se le muestran los pueblos");
                            for (Bestia lp : lista_bestias) {
                                JOptionPane.showMessageDialog(null, "["+cont1+"]"+lp );
                                cont1++;
                            }
                            resp1=JOptionPane.showInputDialog(null, "Que posicion desea eliminar?" );
                            int respp1=Integer.parseInt(resp1);
                            lista_bestias.remove(respp1);
                            break;
                            
                    
                    
                    }

                }
                break;
                case "3": {

                }
                break;
                case "4": {

                }
                break;
            }
        }

    }
}
