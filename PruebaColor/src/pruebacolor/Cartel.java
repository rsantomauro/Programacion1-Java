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
public class Cartel {
    private Color fondo;
    private Color letra;
    
    public Cartel()
    {
    }
    
    public Color getFondo()
    {
        return this.fondo;
    }
    
    public void setFondo(Color unColor)
    {
        this.fondo = unColor;
    }
    
    public Color getLetra()
    {
        return this.letra;
    }
    
    public void setLetra(Color unColor)
    {
        this.letra = unColor;
    }
    
    @Override
    public String toString()
    {
        return "Letra: " + this.letra.toString() + "\nFondo: " + this.fondo.toString();
        //return "Letra: " + this.letra.getAzul() + this.letra.getRojo() + "\nFondo: " + 
        //        this.fondo.getAzul() + this.fondo.getRojo();
    }
}
