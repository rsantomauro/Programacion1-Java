/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacolor;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author docenteFI
 */
public class PruebaColor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Color color1 = new Color();
        color1.setRojo(120);
        color1.setAzul(120);
        color1.setVerde(60);
        System.out.println(color1.toString());
        
        color1.esGris();
        System.out.println(color1.toString());
        
        System.out.println(color1.esPuro());
        
        color1.setAzul(0);
        color1.setRojo(0);

        System.out.println(color1.esPuro());
        
        //Carteles
        Color color2 = new Color(10, 20, 30);
        
        Cartel cartel = new Cartel();
        cartel.setFondo(color1);
        cartel.setLetra(color2);
        
        System.out.println(cartel.toString());
    }
    
}
