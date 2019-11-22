/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class UtilesPrimitivos {
    
    
    public static final int analizarRango(int num, int max, int min) {
        int result = 0;

        if (num >= min && num <= max) {
            result = 0;
        } else if (num <= min && num != min) {
            result = 1;
        } else if (num >= max && num != max) {
            result = 2;
        }
        return result;

    }
    
}
