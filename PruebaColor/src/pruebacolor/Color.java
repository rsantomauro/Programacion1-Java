/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacolor;

/**
 *
 * @author docenteFI
 */
public class Color {
    private int rojo;
    private int verde;
    private int azul;

    public Color()
    {
        this.rojo = 0;
        this.azul = 0;
        this.verde = 0;
    }
    
    public Color(int rojo, int verde, int azul)
    {
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }
    
    public int getRojo()
    {
        return this.rojo;
    }
    
    public void setRojo(int unRojo)
    {
        this.rojo = unRojo;
    }

    public int getVerde()
    {
        return this.verde;
    }
    
    public void setVerde(int unVerde)
    {
        this.verde = unVerde;
    }

    public int getAzul()
    {
        return this.azul;
    }
    
    public void setAzul(int unAzul)
    {
        this.azul = unAzul;
    }
    
    @Override
    public String toString()
    {
        return "****Rojo:" + this.rojo + ", Verde:" + this.verde + 
                ", Azul:" + this.azul;
    }
    
    public void esGris()
    {
        int promedio = (this.rojo + this.verde + this.azul) / 3;
        this.rojo = promedio;
        this.verde = promedio;
        this.azul = promedio;
    }
    
    public boolean esPuro()
    {
        if( (this.rojo == 0 && this.verde == 0) || 
            (this.rojo == 0 && this.azul == 0)  ||
            (this.verde == 0 && this.azul == 0) )
        {
            return true;
        }
        else
        {
            return false;
        }
        
        //return (this.rojo == 0 && this.verde == 0) || 
        //    (this.rojo == 0 && this.azul == 0)  ||
        //    (this.verde == 0 && this.azul == 0)
    }
}
