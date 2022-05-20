/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapersonaempleado;

/**
 *
 * @author docenteFI
 */
public class Empleado extends Persona{
    private int sueldo;
    
    public Empleado()
    {
        this.sueldo = 0;
    }
    
    public int getSueldo()
    {
        return this.sueldo;
    }
    
    public void setSueldo(int unS)
    {
        this.sueldo = unS;
    }
    
    @Override
    public String mensaje()
    {
        return "Es Empleado";
    }
}
