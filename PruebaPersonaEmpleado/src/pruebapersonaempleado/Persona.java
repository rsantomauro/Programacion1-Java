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
public class Persona {
    private int edad;
    
    public Persona()
    {
        this.edad = 0;
    }
    
    public int getEdad()
    {
        return this.edad;
    }
    
    public void setEdad(int unaE)
    {
        this.edad = unaE;
    }
    
    public boolean esMenorQue(Persona unaP)
    {
        return this.getEdad() < unaP.getEdad();
    }
    
    public String mensaje()
    {
        return "Es Persona";
    }
    
    @Override
    public boolean equals(Object obj)
    {
        //Convertir la variable o al tipo especifico de la clase,
        //en este caso, al tipo Persona. Voy a hacer casting
//        Persona personaAux = (Persona)obj;
//        boolean resultado = this.getEdad() == personaAux.getEdad();
//        return resultado;
        
        //Una forma mas reducida
        return this.getEdad() == ((Persona)obj).getEdad();
    }
}
