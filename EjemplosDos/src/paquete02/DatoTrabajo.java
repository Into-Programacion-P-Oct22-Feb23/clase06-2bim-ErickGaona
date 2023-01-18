/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    // método que permita preguntar al usuario el nombre de la empresa
    public static String obtenerTrabajo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese trabajo de persona");
        String trabajoPersona = entrada.nextLine();
        
        return trabajoPersona;
    }
    
    public static String obtenerDireccion(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese direccion trabajo de persona");
        String direcciontrabajo = entrada.nextLine();
        
        return direcciontrabajo;
    }
    // método que permita preguntar al usuario la dirección de la empresa
}
