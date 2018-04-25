
package javaapplication1;
import static java.lang.Math.pow; // Librería para elevar a la potencia
import java.util.Scanner;
/*
Ejercicio:
Solución que permita calcular y presentar los valores de X y Y, teniendo como 
dato de entrada el valor de X y obtener el de Y en base a las siguientes 
restricciones:
Si X<0 entonces Y=3*X+10
Si X>0 entonces Y=X**2+6
Si X==0 entonces Y=1
(usar la instrucción que se crea conveniente)
 
 @author Anderson  Aguirre
 */
public class xy {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double x, y;
    System.out.println("Ingrese el valor de x: ");
    x = entrada.nextDouble();
    if(x < 0){
        y = (3* x +10);
        
    }else{
        if(x > 0){
            y = (pow(x,2)+6);
        }else{
            y = 1;
        }
    }
    System.out.println("El valor de y es igual a: "+y);
    
    }
}