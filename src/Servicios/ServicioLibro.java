/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.EntidadLibro;
import java.util.Scanner;


/**
 *
 * @author H81M-E33
 */
public class ServicioLibro {
    
    Scanner leer = new Scanner(System.in);
    EntidadLibro a1 = new EntidadLibro();
    
    // Vamos a crear los metodos
    
    public void RellenarLibro(){
        System.out.println("Inserte isbn"); 
        a1.isbn = leer.next();
        System.out.println("Inserte titulo"); 
        a1.titulo = leer.next();
        System.out.println("Inserte autor"); 
        a1.autor = leer.next();
        System.out.println("Inserte numero_de_pag"); 
        a1.numero_de_pag = leer.nextInt();
        
        System.out.println(a1);
}    
}
