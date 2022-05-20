/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaagenda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author docenteFI
 */
public class PruebaAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();
        
//        Amigo a1 = new Amigo();
//        a1.setNombre("Ana");
//        a1.setApodo("AA");
//        a1.setTelefono(111111);
//
//        Amigo a2 = new Amigo();
//        a2.setNombre("Juan");
//        a2.setApodo("JJ");
//        a2.setTelefono(22222);
//
//        miAgenda.agregarAmigo(a1);
//        miAgenda.agregarAmigo(a2);
//        
//        //System.out.println(miAgenda.getListaAmigos());
//        mostrarLista(miAgenda.getListaAmigos());
//        
//        Amigo a3 = new Amigo();
//        a3.setNombre("Juan");
//        a3.setTelefono(22222);
//
//        miAgenda.eliminarAmigo(a3);
//
//        mostrarLista(miAgenda.getListaAmigos());
//        
//        agregarAmigo(miAgenda);
//        agregarAmigo(miAgenda);
            
        mostrarMenu(miAgenda);
    }
    
    public static void agregarAmigo(Agenda unaAgenda)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese nombre del amigo");
        String nombre = in.nextLine();
        System.out.println("Ingrese apodo del amigo");
        String apodo = in.nextLine();
        System.out.println("Ingrese numero de telefono del amigo");
        int telefono = in.nextInt();
        
        Amigo amigo = new Amigo();
        amigo.setNombre(nombre);
        amigo.setApodo(apodo);
        amigo.setTelefono(telefono);
        
        boolean loAgrego = unaAgenda.agregarAmigo(amigo);
        if(loAgrego)
        {
            System.out.println("Amigo agregado correctamente");
            System.out.println(amigo.toString());
        }
        else
        {
            System.out.println("Ya existe un amigo con ese nombre y telefono");
        }
    }
    
    public static void mostrarLista(ArrayList<Amigo> unaLista)
    {
        if(unaLista.size() > 0)
        {
            Iterator<Amigo> iterator = unaLista.iterator();
            int contador = 1;

            while(iterator.hasNext())
            {
                System.out.println(contador + " - " + iterator.next());
                contador++;
            }
        }
        else
        {
            System.out.println("No existen amigos");
        }
    }

    private static void mostrarMenu(Agenda unaAgenda)
    {
        Scanner in = new Scanner(System.in);
        int opcion = 1;
        do
        {
            System.out.println("1 - Agregar amigo");
            System.out.println("2 - Mostrar amigos");
            System.out.println("3 - Eliminar un amigo");
            System.out.println("4 - Eliminar un amigo segun posicion");
            System.out.println("5 - Mostrar cantidad");
            System.out.println("6 - Mostrar cantidad");
            System.out.println("7 - Buscar y Modificar");
            System.out.println("8 - Ordenar por nombre");
            System.out.println("9 - Ordenar por numero de telefono");
            System.out.println("10 - Ordenar por nombre y numero de telefono");
            System.out.println("0 - Salir");
            opcion = in.nextInt();
            switch(opcion)
            {
                case 0:
                    System.out.println("Saliendo");
                    break;
                case 1:
                    agregarAmigo(unaAgenda);
                    break;
                case 2:
                    mostrarLista(unaAgenda.getListaAmigos());
                    break;
                case 3:
                    eliminarAmigo(unaAgenda);
                    break;
                case 4:
                    eliminarAmigoPorPosicion(unaAgenda);
                    break;
                case 5:
                    System.out.println("Cantidad:" + unaAgenda.cantidadAmigos());
                    break;
                case 6:
                    mostrarCantidad(unaAgenda);
                case 7:
                    buscarYModificar(unaAgenda);
                    break;
                case 8:
                    ordenarPorNombre(unaAgenda);
                    break;
                case 9:
                    ordenarPorTelefono(unaAgenda);
                    break;
                case 10:
                    ordenarPorNombreYNumeroTelefono(unaAgenda);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while(opcion != 0);
        
        
    }

    private static void eliminarAmigo(Agenda unaAgenda) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = in.nextLine();
        System.out.println("Ingrese telefono");
        int telefono = in.nextInt();
        
        Amigo aux = new Amigo();
        aux.setNombre(nombre);
        aux.setTelefono(telefono);
        
        unaAgenda.eliminarAmigo(aux);
    }

    private static void eliminarAmigoPorPosicion(Agenda unaAgenda) {
        Scanner in = new Scanner(System.in);
        mostrarLista(unaAgenda.getListaAmigos());
        System.out.println("Ingrese el numero a eliminar");
        int posicion = in.nextInt();
        unaAgenda.eliminarAmigo(posicion-1);
    }

    private static void buscarYModificar(Agenda unaAgenda) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese Nombre");
        String nombre = in.nextLine();
        System.out.println("Ingrese telefono");
        int telefono = in.nextInt();
        in.nextLine();
        
        Amigo aux = new Amigo();
        aux.setNombre(nombre);
        aux.setTelefono(telefono);
        
        Amigo buscado = unaAgenda.buscarAmigoConFor(aux);
        
        if(buscado != null)
        {
            System.out.println("Los datos del amigo son:");
            System.out.println(buscado.toString());
            System.out.println("Ingrese nuevo Nombre");
            String nuevoNombre = in.nextLine();
            System.out.println("Ingrese nuevo Apodo");
            String nuevoApodo = in.nextLine();
            System.out.println("Ingrese nuevo telefono");
            int nuevoTelefono = in.nextInt();
            
            buscado.setNombre(nuevoNombre);
            buscado.setApodo(nuevoApodo);
            buscado.setTelefono(nuevoTelefono);
        }
        else
        {
            System.out.println("El amigo buscado no existe");
        }
    }

    private static void mostrarCantidad(Agenda unaAgenda) {
        System.out.println("Cantidad de amigos:" + unaAgenda.cantidadAmigos());
    }

    private static void ordenarPorNombre(Agenda unaAgenda) {
        ArrayList<Amigo> lista = unaAgenda.ordenarPorNombre();
        mostrarLista(lista);
    }

    private static void ordenarPorTelefono(Agenda unaAgenda) {
        ArrayList<Amigo> lista = unaAgenda.ordenarPorTelefono();
        mostrarLista(lista);
    }

    private static void ordenarPorNombreYNumeroTelefono(Agenda unaAgenda) {
        ArrayList<Amigo> lista = unaAgenda.ordenarPorNombreYNumeroTelefono();
        mostrarLista(lista);        
    }
    
}
