/*Ejercicio 4: Calculadora de IMC con Recomendaciones
Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
peso, peso normal, sobrepeso, obesidad).
*/

import java.util.Scanner;

public class calcu_imc {
    public static void main (String[]arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique su peso en Kg: ");
        double peso = sc.nextDouble();
        System.out.println("Indique su altura en metros: ");
        double altura = sc.nextDouble();

        double altura_cuadrado = Math.pow(altura, 2);
        double imc = peso/altura_cuadrado;

        System.out.println("Su IMC es de: " + imc);

        if (imc <= 18.5) {
            System.out.println("Bajo peso: Si tu IMC es inferior a 18.5, es posible que necesites aumentar de peso. Un profesional de la salud puede ayudarte a crear un plan de alimentación y ejercicio adecuado.");
        } else if (imc > 18 && imc <= 24.9) {
            System.out.println("Peso normal: Si tu IMC se encuentra entre 18.5 y 24.9, estás en un rango de peso saludable. Sin embargo, es importante mantener una dieta equilibrada y realizar actividad física regularmente para mantener tu peso y mejorar tu salud.");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Sobrepeso: Si tu IMC está entre 25 y 29.9, es recomendable adoptar un estilo de vida más saludable, que incluya una dieta equilibrada y ejercicio regular. Perder peso de forma gradual puede ayudarte a reducir el riesgo de enfermedades relacionadas con el sobrepeso.");
        } else if (imc > 30) {
            System.out.println("Obesidad: Si tu IMC es igual o superior a 30, es fundamental que consultes a un médico o nutricionista para desarrollar un plan de pérdida de peso personalizado. La obesidad aumenta el riesgo de diversas enfermedades, como diabetes, enfermedades del corazón y algunos tipos de cáncer.");
        }

        System.out.println("\nIMPORTANTE: El IMC es sólo una herramienta de evaluación.\nPara obtener un diagnóstico preciso y un plan de tratamiento adecuado, es esencial consultar a un profesional de la salud.");

        }

    }