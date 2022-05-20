/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaagenda;

import java.util.Comparator;

/**
 *
 * @author docenteFI
 */
public class CriterioNombreYTelefono implements Comparator<Amigo>
{

    @Override
    public int compare(Amigo o1, Amigo o2) {
        int resultado = o1.getNombre().compareTo(o2.getNombre()); //ascendente por nombre
        if(resultado == 0) //Tienen mismo nombre
        {
            resultado = o2.getTelefono() - o1.getTelefono(); //descendente por telefono
        }
        
        return resultado;
    }
    
}
