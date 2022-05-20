/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author docenteFI
 */
public class PruebaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chofer chofer1 = new Chofer();
        chofer1.setCedula(111111);
        chofer1.setNombre("Juan");
        
        Camion camion1 = new Camion();
        camion1.setChapa(111);
        camion1.setColor("ROJO");
        camion1.setModelo(2017);
        camion1.setChofer(chofer1);
        
        ArrayList<Camion> listaCamiones = new ArrayList<Camion>();
        listaCamiones.add(camion1);
        
        Chofer chofer2 = new Chofer();
        chofer2.setCedula(22222);
        chofer2.setNombre("Ana");
        
        Camion camion2 = new Camion();
        camion2.setChapa(222);
        camion2.setColor("AZUL");
        camion2.setModelo(2017);
        camion2.setChofer(chofer2);
        
        listaCamiones.add(camion2);
        System.out.println(listaCamiones);
        
        //listaCamiones.remove(camion1);
        //System.out.println(listaCamiones);
        
        //Elemento en una posicion
        System.out.println("Elemento en posicion 1");
        Camion buscado = listaCamiones.get(0);
        System.out.println(buscado);
        
        //Posicion de un elemento
        int posicion = listaCamiones.indexOf(buscado);
        System.out.println("La posicion es: " + posicion);
        
        //Cantidad de elementos
        int cantidad = listaCamiones.size();
        System.out.println("Candidad es: " + cantidad);
        
        //Recorrida con for
        System.out.println("CON FOR");
        for(int i = 0; i < listaCamiones.size(); i++)
        {
            Camion aux = listaCamiones.get(i);
            System.out.println("Camion Numero " + (i + 1));
            System.out.println(aux.toString());
        }
        
        //Iteradores
        System.out.println("CON ITERADORES");
        Iterator<Camion> itCamiones = listaCamiones.iterator();
        
        while(itCamiones.hasNext())
        {
            Camion aux = itCamiones.next();
            System.out.println(aux.toString());
        }
    }
    
}
