
package javaapplication1;

import java.util.Scanner;

/*
Ejercicio:
Una empresa dedicada a vender teléfonos celulares, en base a las siguientes 
consideraciones:
:Si el cliente es de tipo 1 se le descuenta 10%
:Si el cliente es de tipo 2 se le descuenta 20%
:Si el cliente es de tipo 3 se le descuenta 30%
 
La solución imprimirá el siguiente reporte:
    Nombre: Luis Alvarez
    Tipo de Cliente: 1
    Cantidad de Celulares: 20
    Precio por cada celular: 300
    Subtotal a pagar: cantidad de celulares * precio c/celular
    Descuento: (se debe obtener el descuento)
    Valor final a pagar: Subtotal - Descuento.
 @author Anderson Aguirre
 */
public class ventas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int tipo, cantidad;
        double precioUnitario, subtotal, descuento = 0, total;
        System.out.println("Ingrese nombre y apellido del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Seleccione el tipo de cliente(1,2,3): ");
        tipo = entrada.nextInt();
        System.out.println("Ingrese la cantidad de celulares que compra: ");
        cantidad = entrada.nextInt();     
        System.out.println("Ingrese el valor de cada celular: ");
        precioUnitario = entrada.nextDouble();
        subtotal = cantidad * precioUnitario;
        switch(tipo){
            case 1:
                descuento = subtotal * 10/100;
                break;
            case 2:
                descuento = subtotal * 20/100;
                break;            
            case 3:
                descuento = subtotal * 30/100;
                break;  
            default:
                System.out.printf("Usted a elegido un tipo de cliente no registrado: %d", tipo);
        }
        total = (subtotal - descuento);
        System.out.printf("\tNombre: %s\n", nombre);
        System.out.printf("\tTipo de Cliente: %d\n", tipo);
        System.out.printf("\tCantidad de Celulares: %d celulares\n", cantidad);
        System.out.printf("\tPrecio por cada celular: %.2f USD\n", precioUnitario);
        System.out.printf("\tSubtotal a pagar: %.2f USD\n", subtotal);
        System.out.printf("\tDescuento: %.2f USD\n", descuento);
        System.out.printf("\tValor final a pagar: %.2f USD\n", total);
    }
}
