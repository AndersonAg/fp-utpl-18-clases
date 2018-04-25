
package javaapplication1;
import java.util.Scanner;
/*
Ejercicio:
En una empresa dedicada a la venta de balones, si se compra uno se hace un 
descuento de 50%, si se compra 2 descuento de 70%, se compra 3 o más se 
descuenta 80%. Generar la solución que permita leer el número de balones a 
comprar, el precio de cada balón y el valor final a cancelar.
 
 @author Anderson Aguirre
 */
public class balon {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int cantidad;
    double precioUnitario, subtotal, total, descuento;
 
    System.out.println("Ingrese el número de balones que se compran: ");
    cantidad = entrada.nextInt();
    System.out.printf("Ingrese el precio unitario de cada balón: ");
    precioUnitario = entrada.nextDouble();

    subtotal = cantidad * precioUnitario;
    if(cantidad == 1){      
        descuento = subtotal * 50/100;
   
    }else{
        if(cantidad == 2){
            descuento = subtotal * 70/100;
            
        }else{   
            descuento = subtotal * 80/100;
        }    
    }
    total = subtotal - descuento;
    
    System.out.printf("\tCantidad de Balones: %d balones\n", cantidad);
    System.out.printf("\tPrecio de cada balón: %.2f USD\n", precioUnitario);
    System.out.printf("\tValor final a cancelar: %.2f USD\n", total);
    
    }
}