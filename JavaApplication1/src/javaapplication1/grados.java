
package javaapplication1;
import java.util.Scanner; 
/*
Ejercicio:
La conversión de grados Celcius (C) a Fahrenheit (F) se realiza con la siguiente
expresión matemática:
F = (9/5)*C+32
La conversión de Fahrenheit (F) a grados Celcius (C) se realiza con la siguiente
expresión matemática:
C = (F-32)5/9
Generar la solución que permita obtener por parte de usuario el tipo de 
conversión que desea realizar y posterior presentación del resultado requerido.
(usar la instrucción que se crea conveniente)
 
 @author Anderson Aguirre
 */
public class grados {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double celsius, fahrenheit, temperatura = 0;
    int opcion;
    System.out.printf("Escoja que conversion desea realizar: \nDe Celsius a Fahrenheit --> 1\nDe Fahrenheit a Celsius --> 2\n");
    opcion = entrada.nextInt();
    switch(opcion){
        case 1:
            System.out.printf("Ingrese la temperatura a convertir: ");
            temperatura = entrada.nextDouble();
            temperatura = (9/5) * temperatura + 32;
            break;
        case 2:
            System.out.printf("Ingrese la temperatura a convertir: ");
            temperatura = entrada.nextDouble();            
            temperatura = (temperatura - 32) * 5/9;
            break;
        default:
            System.out.printf("ERROR, opcion incorrecta: %d\n", opcion);
    }
    if(opcion == 1){ 
        System.out.printf("La temperatura es: %.2f grados Fahrenheit", temperatura);
    }
    if(opcion == 2){
        System.out.printf("La temperatura es: %.2f grados Celcius", temperatura);
    }
    }
}