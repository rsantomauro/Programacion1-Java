/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapersonaempleado;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author docenteFI
 */
public class PruebaPersonaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado();

        e1.setEdad(25);

        Empleado e2;
        e2 = new Empleado();

        e2.setEdad(15);

        //UPCASTING
        boolean esMenor = e1.esMenorQue(e2);
        System.out.println("Es Menor:" + esMenor);
        
        Persona p3 = new Empleado();
        p3.setEdad(20);
        ((Empleado)p3).setSueldo(100);
        
        System.out.println(p3.mensaje());
        Persona p4 = new Persona();
        p4.setEdad(20);
        System.out.println(p4.mensaje());

        System.out.println(p3.equals(p4));
        System.out.println(p3.equals(p3));
    }
    
}
