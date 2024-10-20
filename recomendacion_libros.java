/*Ejercicio 3: Sistema de Recomendación de Libros
Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
ciencia ficción) y luego recomiende un libro basado en su elección.*/

import java.util.Scanner;

public class recomendacion_libros {
    static String fantasia = "La rueda del tiempo, Robert Jordan. \nUna saga épica de fantasía con un mundo vasto y complejo, llena de magia, profecías y personajes inolvidables.";
    static String misterio = "Crimen y castigo, Fiodor Dostoievki. \nUn clásico de la literatura universal que explora la psicología de un asesino y las consecuencias de sus actos.";
    static String romance = "Orgullo y prejuicio, Jane Austen. \nOtro clásico imperdible, con una historia de amor llena de ironía y personajes inolvidables.";
    static String cienciaFiccion = "Farenheit 451, Ray Bradbury. \nUna distopía que explora el valor de la literatura en un mundo donde los libros están prohibidos y son quemados. Una reflexión sobre la censura y la importancia de la libertad de expresión.";

    public static String pelicula(int opcion){
        return switch (opcion){
            case 1 -> fantasia;
            case 2 -> misterio;
            case 3 -> romance;
            case 4 -> cienciaFiccion;
            default -> "Opción inválida, vuelva a intentar.";
        };
    }

    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                ¡Bienvenidx a nuestra plataforma de recomendaciones de libros!
                Elegí cuál es el género que deseas leer esta vez:
                1. Fantasía
                2. Misterio
                3. Romance
                4. Ciencia ficción
                 """);
        try {
            int op = sc.nextInt();
            System.out.println(pelicula(op));
        }catch (Exception e){
            System.out.println("Error: " + e);
        }

    }
}











