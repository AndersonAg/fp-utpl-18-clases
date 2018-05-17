
package semana7;

/**
 *
 * @author Anderson Aguirre
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int suma = 0;
        for (int contador = 1; contador <= 20; contador ++){
            if (contador % 2 == 0 ){
             suma = suma + contador;
        }
           
        }
                System.out.printf("La suma es de los numeros pares es: %d",suma);

        System.out.println();
    }
    
}
