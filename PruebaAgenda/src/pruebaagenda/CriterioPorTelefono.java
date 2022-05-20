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
public class CriterioPorTelefono implements Comparator<Amigo>
{

    @Override
    public int compare(Amigo o1, Amigo o2) {
        return o1.getTelefono() - o2.getTelefono();
    }
    
}
