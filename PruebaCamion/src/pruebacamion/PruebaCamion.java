/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacamion;

import java.util.*;

/**
 *
 * @author docenteFI
 */
public class PruebaCamion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Camion camion1 = new Camion();
//        Camion camion1;
//        camion1 = new Camion();
//        
//        camion1.setChapa(111);
//        camion1.setColor("ROJO");
//        
//        Camion camion2 = new Camion();
//        camion2.setChapa(222);
//        camion2.setColor("AZUL");
//
//        System.out.println(camion1);
//        System.out.println(camion2);
//
//        camion1.setColor("AMARILLO");
//        System.out.println(camion1);
//        
//        System.out.println("El color del camion 1 es: " + camion1.getColor());
//
//        Camion camion3 = new Camion();
//        System.out.println(camion3);
//        
//        Camion camion4 = new Camion(444, "VERDE");
//        System.out.println("Camion 4: " + camion4);
//        
//        
//        System.out.println(camion3.tieneMismoColor(camion4));
//        
//        Camion.setAñoRevision(2015);
//        
//        ////Camiones con chofer
//        Camion camion5 = new Camion(555, "NARANJA", 2015);
//        Chofer chofer1 = new Chofer();
//        chofer1.setNombre("Juan");
//        chofer1.setCedula(111111);
//        camion5.setChofer(chofer1);
//        
//        System.out.println(camion5);

            System.out.println("Voy a llamar al metodo");
            Camion camion1 = PruebaCamion.crearCamion();
            Camion camion2 = PruebaCamion.crearCamion();
            System.out.println(camion1.toString());
            System.out.println(camion2.toString());
            System.out.println("Llame al metodo");
            
            System.out.println(camion1.getChapa());
            System.out.println(camion1.getChofer().getNombre());
            
            mostrarMenu();
    
            
    }
    
    //Metodo para manejar menu
    public static void mostrarMenu()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1***");
        int opcion = 1;
        do
        {
            System.out.println("1 - Crear Camion");
            System.out.println("2 - Crear Chofer");
            System.out.println("0 - Salir");
            System.out.println("Ingrese opcion");
            opcion = in.nextInt();
            System.out.println("2***");
            
//            if(opcion == 1)
//            {
//                Camion camion = crearCamion();
//                System.out.println(camion.toString());
//            }
//
//            if(opcion == 2)
//            {
//                Chofer chofer = crearChofer();
//                System.out.println(chofer.toString());
//            }
//            if(opcion > 2 || opcion < 0)
//            {
//                System.out.println("Opcion incorrecta");
//            }
            
            switch(opcion)
            {
                case 1:
                    Camion camion = crearCamion();
                    System.out.println(camion.toString());
                    System.out.println("3***");
                    break;
                case 2:
                    Chofer chofer = crearChofer();
                    System.out.println(chofer.toString());
                    break;
                default:
                    if(opcion != 0)
                    {
                        System.out.println("Opcion no es correcta. Reintente");
                    }
                    break;
            }
        }
        while(opcion != 0);

    }
    
    //Metodo para creacion de nuevos camiones
    public static Camion crearCamion()
    {
        System.out.println("Estoy entrando al metodo");
        Scanner in = new Scanner(System.in);
        
        int chapa = 0;
        String color = "";
        int modelo = 0;
        
        System.out.println("Ingrese chapa");
        chapa = in.nextInt();
        in.nextLine();
        System.out.println("Ingrese color");
        color = in.nextLine();
        System.out.println("Ingrese modelo");
        modelo = in.nextInt();
        
        Camion camion = new Camion(chapa, color, modelo);
        camion.setChapa(111);

        Chofer chofer = crearChofer();
        camion.setChofer(chofer);
        
        System.out.println("Estoy saliendo del metodo");
        Vehiculo v = new Vehiculo();

        return camion;
        
    }
    
    public static Chofer crearChofer()
    {
        Scanner in = new Scanner(System.in);
        String nombreChofer = "";
        int cedulaChofer = 0;

        System.out.println("Ingrese nombre del chofer");
        nombreChofer = in.nextLine();
        System.out.println("Ingrese cedula del chofer");
        cedulaChofer = in.nextInt();
        
        Chofer chofer = new Chofer();
        chofer.setNombre(nombreChofer);
        chofer.setCedula(cedulaChofer);

        return chofer;
    }
}
