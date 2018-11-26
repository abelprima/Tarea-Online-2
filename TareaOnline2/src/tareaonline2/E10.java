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
public class E10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        
        if (numero > 0) {
            System.out.println("El número es positivo.");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0)
                System.out.println(i);
        }
        }
    }
    
}
