/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacamion;

/**
 *
 * @author docenteFI
 */
public class Chofer {
    private String nombre;
    private int cedula;
    
    public Chofer()
    {
        this.nombre = "";
        this.cedula = 0;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String unNombre)
    {
        this.nombre = unNombre;
    }
    
    public int getCedula()
    {
        return this.cedula;
    }
    
    public void setCedula(int unaCedula)
    {
        this.cedula = unaCedula;
    }
    
    @Override
    public String toString()
    {
        return "Cedula:" + this.getCedula()+ "\nNombre: " + this.getNombre();
    }
    
}
