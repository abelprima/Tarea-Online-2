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
public class E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int respuesta;
        int num1;
        int num2;
        float resultado;
        
        System.out.println("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        System.out.println("Menú");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        
        respuesta = teclado.nextInt();
        
        switch (respuesta) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
              
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);
                
                break;
            case 5:
                System.out.println("Salir.");
                
                break;
            default:
                System.out.println("Ese número no corresponde con ninguna de las opciones disponibles");
                            
        }
    }
    
}
