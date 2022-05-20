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
public class Vehiculo {
    protected int chapa;

    public Vehiculo()
    {
        
    }
    
    public int getChapa()
    {
        return this.chapa;
    }
    
    public void setChapa(int unaChapa)
    {
        this.chapa = unaChapa;
    }
    
    @Override
    public String toString()
    {
        return "La chapa es:" + this.getChapa();
    }
}
