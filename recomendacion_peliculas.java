/*Ejercicio 1: Sistema de Recomendación de Películas
Escribe un programa que pida al usuario su género de película favorito
(acción, comedia, drama, ciencia ficción) y luego recomiende una
película basada en su elección.
*/
import java.util.Scanner;
public class recomendacion_peliculas {
    static String accion = "John Wick (2014): Un ex-asesino a sueldo debe volver a la acción cuando le roban el coche y matan a su perro.";
    static String comedia = "Todo en todas partes al mismo tiempo (2023): Una mujer de mediana edad se ve arrastrada a una aventura salvaje a través del multiverso, donde debe conectar con versiones alternativas de sí misma para salvar al mundo.";
    static String drama = "La La Land (2016): Un pianista de jazz y una aspirante a actriz se enamoran en Los Ángeles, pero sus ambiciones profesionales amenazan su relación.";
    static String ciencia_ficcion = "Interstellar (2014): Un grupo de astronautas emprende un viaje a través de un agujero de gusano para encontrar un nuevo hogar para la humanidad.";
    static String otras_peliculas = """
            Películas de superhéroes: "Spider-Man: No Way Home" (2021).
            Un clásico: "El Padrino" (1972).
            De animación: "Soul" (2020).
          """;

    public static String pelicula(int opcion){
        return switch (opcion){
            case 1 -> accion;
            case 2 -> comedia;
            case 3 -> drama;
            case 4 -> ciencia_ficcion;
            case 5 -> otras_peliculas;
            default -> "Opción inválida, vuelva a intentar.";
        };
    }
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                ¡Bienvenidx a nuestra plataforma de recomendaciones!
                Elegí cuál es el género que deseas ver hoy:
                1. Acción
                2. Comedia
                3. Drama
                4. Ciencia ficción
                5. Otras
                 """);
        try {
            int op = sc.nextInt();
            System.out.println(pelicula(op));
            }catch (Exception e){
                System.out.println("Error: " + e);
        }

    }




}
