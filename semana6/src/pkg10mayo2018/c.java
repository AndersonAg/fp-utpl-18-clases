
package pkg10mayo2018;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class c  {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        double suma_total = 0;
        double promedio_final = 0;
        boolean bandera = true;
        System.out.println("Ingrese las notas de los estudiantes de su materia");
        while (bandera){
            System.out.printf("Ingrese calificación número %d\n", contador);
            int valor = entrada.nextInt();
            double valor_real = (double)valor;
            suma_total = suma_total + valor_real;
            contador = contador + 1;
            
            entrada.nextLine(); // Ojo usamos el limpiador del scanner.
            // proceso para salir del ciclo.
            
            System.out.println("Ingrese si(salir)");
            String temporal = entrada.nextLine();
            if(temporal.equals("si")){
                bandera = false;
            }
        }
        promedio_final = suma_total/contador;
        System.out.printf("El promedio final es %.2f\n", promedio_final);
        
    }
}