/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaagenda;

/**
 *
 * @author docenteFI
 */
public class Amigo implements Comparable<Amigo>{
    private String nombre;
    private String apodo;
    private int telefono;
    
    public Amigo()
    {
        this.nombre = "";
        this.apodo = "";
        this.telefono = -1;
    }
    
    public Amigo(String unNombre, String unApodo, int unTelefono)
    {
        this.nombre = unNombre;
        this.apodo = unApodo;
        this.telefono = unTelefono;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String unNombre)
    {
        this.nombre = unNombre;
    }
    
    public String getApodo()
    {
        return this.apodo;
    }
    
    public void setApodo(String unApodo)
    {
        this.apodo = unApodo;
    }
    
    public int getTelefono()
    {
        return this.telefono;
    }
    
    public void setTelefono(int unTelefono)
    {
        this.telefono = unTelefono;
    }
    
    @Override
    public String toString()
    {
        return "Nombre: " + this.nombre + ", Apodo: " + this.apodo + 
                ", Telefono:" + this.telefono + "\n";
    }
    
    @Override
    public boolean equals(Object obj)
    {
        //Son iguales si tienen mismo Nombre y telefono
        Amigo aux = (Amigo)obj;
        boolean resultado = this.nombre.equalsIgnoreCase(aux.getNombre()) &&
                            this.telefono == aux.getTelefono();
        return resultado;
    }

    @Override
    public int compareTo(Amigo o) {
        //return this.getNombre().compareTo(o.getNombre()); //Ascendente
        return o.getNombre().compareTo(this.getNombre()); //Descendente
        //return this.getTelefono() - o.getTelefono();
    }
}
