/*Ejercicio 7: Sistema de Recomendación de Actividades
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
recomiende una actividad basada en su estado de ánimo*/

import java.util.Scanner;
public class RecomendarActividades {
    static String feliz = "Tu ánimo es ideal para que des un paseo por el parque";
    static String triste = "Tomar un café y leer un buen libro te ayudará";
    static String enérgico = "Agarrá tus zapatillas y salí a caminar o correr, aprovecha tu energía";
    static String relajado = "Buen momento para ver una película y descansar";

    public static String animo(int opcion) {
        return switch (opcion) {
            case 1 -> feliz;
            case 2 -> triste;
            case 3 -> enérgico;
            case 4 -> relajado;
            default -> "Error";

        };
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                ¡Hola! Para recomendarte una actividad para tu día necesitamos saber cómo te sentís. 
                Indicanos cuál es tu estado de ánimo:
                1. Feliz.
                2. Triste
                3. Enérgico
                4. Relajado
                """);
        try {
            int op = sc.nextInt();
            System.out.println(animo(op));
        } catch (Exception e) {
            System.out.println("Error: Opción inválida, vuelva a intentar");
            {


            }
        }
    }
}
