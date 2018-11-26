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
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        int resultado;
        
        System.out.println("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        
        if (num1 > num2) {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
    }
        else if (num1 < num2) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        }
        else {
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        }
    }
    
}
