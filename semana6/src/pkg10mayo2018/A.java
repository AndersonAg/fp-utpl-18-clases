/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10mayo2018;

/**
 *
 * @author DELL
 */
public class A {
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=1;
        int suma=0;
        System.out.printf("Contador \tSuma\n");
        while(contador<=4){
            suma = suma +contador;
            System.out.printf("%d \t\t",contador);
            System.out.printf("%d\n",suma);
            contador=contador+1;
            
        }
    }
    
}