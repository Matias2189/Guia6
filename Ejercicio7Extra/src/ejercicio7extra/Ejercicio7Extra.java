/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package ejercicio7extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio7Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N, valMax=0, valMin=0, aux=0, contador=0;
        float promedio, suma=0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Indique cantidad de numeros a ingresar: ");
        N=leer.nextInt();
        int vector[]= new int [N];
        
        while(){
            if (valMax<N) {
                valMax=N;
                
            }
            if (valMin>N) {
                valMin=N;
                
            }
            System.out.println("Siga ingresando numeros. Finalice con un numero negativo o 0");
            N=leer.nextInt();
            suma+=N;
            contador++;
            if (N==0) {
                break;
            }
        }
        System.out.println("El valor maximo es: "+valMax);
        System.out.println("El valor minmio es: "+valMin);
        System.out.println("El promedio es: "+suma/(contador+1));
    }
    
}
