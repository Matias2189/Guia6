/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota");
        nota = leer.nextInt();
        while (nota < 0 || nota > 10){
            System.out.println("La nota debe estar entre 0 y 10 Ingrese otra nota");
            nota = leer.nextInt();
        }
        System.out.println("La nota " + nota + " esta entre 0 y 10");
    }
    
}
