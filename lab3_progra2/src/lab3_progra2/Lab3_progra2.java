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
        while (!opcion.equalsIgnoreCase("5")) {
            opcion = JOptionPane.showInputDialog("Ingrese opcion \n"
                    + "1-Agregar \n"
                    + "2-Eliminar \n"
                    + "3-Modificar \n"
                    + "4-Batalla \n"
                    + "5-Salir \n");
            switch (opcion) {
                case "1": {//agregar
                       String opcion1=JOptionPane.showInputDialog("Ingrese opcion \n"
                               + "1-Agregar pueblos \n"
                               + "2-Agregar lugares \n"
                               + "3-Agregar Integrantes \n"
                               + "4-Agregar bestias");
                       switch(opcion1){
                           case "1":{//pueblos 
                               String nombre=JOptionPane.showInputDialog("Ingrese nombre");
                               lista_pueblo.add(new Pueblo(nombre));
                               JOptionPane.showMessageDialog(null, "Hecho");
                           }break;
                           case "2":{//lugares
                               String pueblos="";
                               for (Pueblo p : lista_pueblo) {
                                   pueblos+="\n"+lista_pueblo.indexOf(p)+" "+p;
                               }
                               int op=Integer.parseInt(JOptionPane.showInputDialog(pueblos+"\n"+"Ingrese opcion"));
                               String l=JOptionPane.showInputDialog("Ingrese tipo de lugar \n"
                                       + "1-Comarca \n"
                                       + "2-Gondor \n"
                                       + "3-Mordor \n");
                               switch(l){
                                   case "1":{//comarca
                                       int casas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de casas"));
                                       int extension=Integer.parseInt(JOptionPane.showInputDialog("Extension territorio"));
                                       int numero=Integer.parseInt(JOptionPane.showInputDialog("numero de integrantes"));
                                       lista_pueblo.get(op).getLugares().add(new Comarca(casas,extension,numero));
                                       JOptionPane.showMessageDialog(null, "Hecho");
                                   }break;
                                   case "2":{//Gondor
                                       int parajes=Integer.parseInt(JOptionPane.showInputDialog("Parajes"));
                                       int extension=Integer.parseInt(JOptionPane.showInputDialog("Extension territorio"));
                                       int numero=Integer.parseInt(JOptionPane.showInputDialog("numero de integrantes"));
                                       lista_pueblo.get(op).getLugares().add(new Gondor());
                                       JOptionPane.showMessageDialog(null, "Hecho");
                                   }break;
                                   case "3":{//Mordor
                                       int extension=Integer.parseInt(JOptionPane.showInputDialog("Extension territorio"));
                                       int numero=Integer.parseInt(JOptionPane.showInputDialog("numero de integrantes"));
                                       JOptionPane.showMessageDialog(null, "Hecho");
                                   }break;
                                   
                               }
                               
                           }break;
                           case "3":{//Integrantes
                               
                           }break;
                           case "4":{//Bestias
                               
                           }break;
                       }
                }
                break;
                case "2": {

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
