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
public class entrada {

    public static void main(String[] args) {
        // TODO code application logic here
        int estatura;
        int contador = 0;
        int suma = 0;
        int promedio;
        while (contador < 5) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("ingrese el valor de la estatura en centimetros");
            estatura = entrada.nextInt();
            if (estatura < 120) {
                estatura = 120;
            }
            System.out.printf("=%d \n", estatura );

            suma = suma + estatura;
            contador = contador + 1;
        }
        promedio = (suma / 5);
        System.out.printf("el promedio de estaturas es de %d centimetros", promedio);

    }

}
