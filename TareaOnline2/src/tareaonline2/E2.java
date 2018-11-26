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
public class E2 {
     public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero = teclado.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo.");
        }
        else if (numero < 0) {
            System.out.println("El número es negativo.");
        }
        else {
            System.out.println("El número es cero.");
        }
    }
}
