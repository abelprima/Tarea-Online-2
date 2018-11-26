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
public class E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 9;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        numero = teclado.nextInt();
        for (int c = 1; c <= 10; c = c + 1) {
            int resultado = numero * c;
            System.out.println(numero + " x " + c + " = " + resultado);
        }
    }
    
}
