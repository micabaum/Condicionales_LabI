/*Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
15% para jubilados. Imprime el precio final después del descuento.
*/

import java.util.Scanner;

public class calcu_desc {
static double desc_estudiantes = 0.90;
static double desc_adultos = 0.95;
static double desc_jubilados = 0.75;
static double preciofinal = 0.0;



    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Por favor ingrese el precio del producto: ");
        double precio_producto = sc.nextFloat();
        System.out.print("Indique su tipo de descuento:\n 1.Estudiante \n 2. Adulto \n 3. Jubilado \n");
        int opcion = sc.nextInt();
        if (opcion == 1) {
        preciofinal = (double) precio_producto * desc_estudiantes;
        } else if (opcion == 2) {
        preciofinal = (double) precio_producto * desc_adultos;
        } else if (opcion == 3) {
        preciofinal = (double) precio_producto * desc_jubilados;
        } else if (opcion != 1 && opcion != 2 && opcion != 3) {
                    System.out.println("La opción ingresada es incorrecta. \nVuelva a intentarlo");
                }

        System.out.println("El precio final con descuento es: " + preciofinal);



    }
}