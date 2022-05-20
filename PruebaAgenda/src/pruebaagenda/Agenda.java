/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaagenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author docenteFI
 */
public class Agenda {
    
    private ArrayList<Amigo> listaAmigos;
    private String nombre;
    
    public Agenda()
    {
        this.nombre = "";
        this.listaAmigos = new ArrayList<Amigo>();
    }
    
    public Agenda(String unN)
    {
        this.nombre = unN;
        this.listaAmigos = new ArrayList<Amigo>();
    }

    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String unNombre)
    {
        this.nombre = unNombre;
    }
    
    public ArrayList<Amigo> getListaAmigos()
    {
        return this.listaAmigos;
    }
    
    public void setListaAmigos(ArrayList<Amigo> unaLista)
    {
        this.listaAmigos = unaLista;
    }
    
    public boolean agregarAmigo(Amigo unAmigo)
    {
        if(existeAmigo(unAmigo))
        {
            return false;
        }
        else
        {
            this.listaAmigos.add(unAmigo);
            return true;
        }
    }
    
    public void eliminarAmigo(Amigo unAmigo)
    {
        this.listaAmigos.remove(unAmigo);
    }
    
    public void eliminarAmigo(int posicion)
    {
        this.listaAmigos.remove(posicion);
    }

    public void eliminarAmigoPorNombre(String nombre)
    {
        boolean encontrado = false;
        for(int i = 0; (i < this.listaAmigos.size() && !encontrado); i++)
        {
            if(this.getListaAmigos().get(i).getNombre().equals(nombre))
            {
                encontrado = true;
                this.eliminarAmigo(this.listaAmigos.get(i));
            }
        }
    }

    public boolean existeAmigo(Amigo unAmigo)
    {
        int posicion = this.listaAmigos.indexOf(unAmigo);
        if(posicion == -1) //-1: no lo encontre
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public int cantidadAmigos()
    {
        return this.listaAmigos.size();
    }
    
    public Amigo buscarAmigoConFor(Amigo unAmigo)
    {
        for(int i = 0; i < this.listaAmigos.size(); i++)
        {
            if(this.listaAmigos.get(i).equals(unAmigo))
            {
                return this.listaAmigos.get(i);
            }
        }
        
        return null;
    }

    public Amigo buscarAmigoConIterador(Amigo unAmigo)
    {
        Iterator<Amigo> iterator = this.listaAmigos.iterator();
        
        while(iterator.hasNext())
        {
            Amigo aux = iterator.next();
            if(aux.equals(unAmigo))
            {
                return aux;
            }
        }
        return null;
    }
    
    public Amigo buscarAmigoIndexOf(Amigo unAmigo)
    {
        int posicion = this.listaAmigos.indexOf(unAmigo);
        
        if(posicion >= 0)
        {
            return this.listaAmigos.get(posicion);
        }
        else
        {
            return null;
        }
    }
    
    public ArrayList<Amigo> ordenarPorNombre()
    {
        Collections.sort(listaAmigos);
        return this.listaAmigos;
    }

    public ArrayList<Amigo> ordenarPorTelefono() {
        Collections.sort(listaAmigos, new CriterioPorTelefono());
        return this.listaAmigos;
    }
    
    public ArrayList<Amigo> ordenarPorNombreYNumeroTelefono()
    {
        Collections.sort(listaAmigos, new CriterioNombreYTelefono());
        return this.listaAmigos;
    }

}
