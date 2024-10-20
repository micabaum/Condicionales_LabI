/*Ejercicio 6: Evaluador de Hábitos Saludables
Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
hábitos saludables basada en estos datos. */

import java.util.Scanner;

public class HabitosSaludables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas horas al día dormís?\n");
        int sueño = sc.nextInt();
        System.out.print("¿Cuántas horas hacés de ejercicio al día?\n");
        int ejercicio = sc.nextInt();
        System.out.print("¿Cuántas comidas saludables hacés al día?\n");
        int comidas = sc.nextInt();

        if (sueño < 7) {
            System.out.print("Necesitas dormir más. Un adulto promedio debe dormir entre 7 y 9 horas diarias\n");
        } else if (sueño > 9) {
            System.out.print("Estás durmiendo demasiado. Intenta ajustar tu horario para dormir entre 7 y 9 horas diarias.\n");
        }else {
            System.out.print("¡Muy bien! Estás durmiendo lo necesario para que tu cuerpo funciones correctamente.\n");
        }
        if (ejercicio < 1) {
            System.out.print("Deberías intentar realizar ejercicio físico en tu rutina diaria.\n");
        } else if (ejercicio >= 1 && ejercicio < 2) {
            System.out.print("Tu rutina de ejercicios es suficiente, si puedes aumentar la duración o intensidad sería aún mejor!.\n");
        } else if (ejercicio >= 2) {
            System.out.print("¡Muy bien! Sos muy activo/a.\n");
        }
        if (comidas < 3) {
            System.out.print("En tu dieta diaria debería haber al menos 3 comidas saludables, intenta cambiar tus hábitos.\n");
        } else if (comidas>=3 && comidas<5) {
            System.out.print("Vas por muy buen camino. Quizás puedes incluir aún más frutas y verduras.\n");
        } else if (comidas>=5) {
            System.out.print("¡Excelente! Te estás alimentando muy bien.\n");

        }

    }

    }
