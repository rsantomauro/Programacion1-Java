/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarraylist;

/**
 *
 * @author docenteFI
 */
public class Camion extends Vehiculo{
    private String color;
    private int modelo;
    private Chofer chofer;
    
    private static int añoRevision = 2000;
    
    public Camion()
    {
        //Si el atributo es protegido, puedo hacer esto
        this.chapa = -1;
        //Sino utilizo metodos publicos/protegidos disponibles
        this.setChapa(-1);
        this.color = "NO TIENE COLOR";
        this.modelo = 0;
    }
    
    public Camion(int unaChapa)
    {
        this.chapa = unaChapa;
        this.color = "NO TIENE COLOR";
        this.modelo = 0;
    }
    
    public Camion(String unColor)
    {
        this.chapa = -1;
        this.color = unColor;
        this.modelo = 0;
    }

    public Camion(int unaChapa, String unColor)
    {
        this.chapa = unaChapa;
        this.color = unColor;
        this.modelo = 0;
    }
    
    public Camion(int unaChapa, String unColor, int unModelo)
    {
        this.chapa = unaChapa;
        this.color = unColor;
        this.modelo = unModelo;
    }

    public String getColor()
    {
        return this.color;
    }
    
    public void setColor(String unColor)
    {
        this.color = unColor;
    }
    
    public int getModelo()
    {
        return this.modelo;
    }
    
    public void setModelo(int unModelo)
    {
        this.modelo = unModelo;
    }
    
    public Chofer getChofer()
    {
        return this.chofer;
    }
    
    public void setChofer(Chofer unChofer)
    {
        this.chofer = unChofer;
    }
    
    @Override
    public String toString()
    {
//        return "Chapa:" + this.getChapa() + "\nColor: " + this.getColor() +
//                "\nModelo: " + this.getModelo() + "\nChofer: " + this.getChofer().toString();
        String retorno;
        if(this.modelo < 2015)
        {
            retorno = "CAMION VIEJO";
        }
        else
        {
            retorno = "CAMION NUEVO";
        }
        
        retorno = retorno + super.toString() + "\nColor: " + this.getColor() +
                "\nModelo: " + this.getModelo() + "\nChofer: " + this.getChofer().toString();
        return retorno;
        
    }
    
    public boolean tieneMismoColor(Camion unCamion)
    {
        return this.getColor().equals(unCamion.getColor());
    }
    
    public boolean leTocaRevision()
    {
        return this.getModelo() <= Camion.añoRevision;
    }
    
    public static void setAñoRevision(int unAño)
    {
        Camion.añoRevision = unAño;
    }
}
