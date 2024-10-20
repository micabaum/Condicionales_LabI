/*Ejercicio 5: Juego de Piedra, Papel o Tijera
Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
elige una opción al azar y determina quién gana. Imprime el resultado del juego.*/

import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("¡Bienvenido al juego de Piedra, Papel o Tijera!\nElige (piedra, papel o tijera):");
        String jugador = scanner.nextLine().toLowerCase();

        int opcion_computadora = random.nextInt(3);
        String opciones[] = {"piedra", "papel", "tijera"};
        String computadora = opciones[opcion_computadora];

        System.out.println("La computadora eligió: " + computadora);

        if (jugador.equals(computadora)) {
            System.out.println("¡Empate!");
        } else if ((jugador.equals("piedra") && computadora.equals("tijera")) ||
                (jugador.equals("papel") && computadora.equals("piedra")) ||
                (jugador.equals("tijera") && computadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
    }
}