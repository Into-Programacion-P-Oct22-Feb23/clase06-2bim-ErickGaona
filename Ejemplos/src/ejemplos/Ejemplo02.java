/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.security.SecureRandom;
import java.util.Scanner;
// import java.security.*;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese limite");
        int valor = entrada.nextInt();
        if (valor > 0) {
            int valorA = obtenerNumero(valor); // 3
            int valorB = obtenerNumero(valor); // 2
            int suma = obtnerSuma(valorA, valorB);

            System.out.printf("La suma de %d + %d es igual a: %d\n",
                    valorA,
                    valorB,
                    suma);

        } else {
            
                System.out.println("ERROR");

            
        }
    }

    public static int obtenerNumero(int c) {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();

        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(c);
        return valorAleatorio;
    }

    public static int obtnerSuma(int a, int b) {
        return a + b;
    }

}
