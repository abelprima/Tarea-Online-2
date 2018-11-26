/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaonline2;

import java.util.Scanner;

/**
 *
 * @author abelp
 */
public class E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = teclado.nextInt();
        if (num1 > num2) {
            System.out.println("El número mas grande es: " + num1);
            }
        else if (num1 < num2) {
            System.out.println("El número mas grande es: " + num2);
        }
        else
            System.out.println("Los dos números son iguales.");
    }
    
}
