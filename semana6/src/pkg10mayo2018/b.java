/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10mayo2018;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class b {

    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        int contador = 0;
        int suma = 0;
        String cadenafinal = String.format("%s\t%s\n","edad","suma");
        while (contador <= 5) {
            System.out.println("ingrese el valor de la edad");
            Scanner entrada = new Scanner(System.in);
            edad = entrada.nextInt();
            cadenafinal = String.format("%s%d\t%d\n", cadenafinal, edad, suma);
            suma = suma + edad;
            contador = contador + 1;
        }
        System.out.printf("%s", cadenafinal);

    }

}
