import java.util.Scanner;
import java.util.Objects;
public class Ejercicio22 {
    public static void main(String[] args) {
        int operando1, operando2;
        String operador;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primero operando: ");
        operando1 = entrada.nextInt();
        System.out.print("Ingrese uno de los siguientes operadores (SUMA, RESTA, MULTIUPLICACION o DIVISION: ");
        operador = entrada.next();
        System.out.print("Ingrese el segundo operando: ");
        operando2 = entrada.nextInt();


        calculadora(operando1, operando2, operador);

        System.out.println("----------Fin del Programa----------");


    }

    public static void calculadora(int operando1, int operando2, String operador) {
        int resultado = 0;
        if (Objects.equals(operador, "SUMA")) {
            resultado = operando1 + operando2;
            System.out.println("\nEl resultado es: " + resultado);
        } else if (Objects.equals(operador, "RESTA")) {
            resultado = operando1 - operando2;
            System.out.println("\nEl resultado es: " + resultado);
        } else if (Objects.equals(operador, "MULTIPLICACION")) {
            resultado = operando1 * operando2;
            System.out.println("\nEl resultado es: " + resultado);
        } else if (Objects.equals(operador, "DIVISION")) {
            resultado = operando1 / operando2;
            System.out.println("\nEl resultado es: " + resultado);
        } else {
            System.out.println("\nEl resultado es: " + resultado);

        }


    }
}
