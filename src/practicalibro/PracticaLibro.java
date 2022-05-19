/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalibro;

import Servicios.ServicioLibro;
import java.util.Scanner;

/**
 *
 * @author H81M-E33
 */
public class PracticaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        ServicioLibro as = new ServicioLibro();
        
        as.RellenarLibro();
    }
    
}
