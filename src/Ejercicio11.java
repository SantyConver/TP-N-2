import java.util.Objects;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        double base, exponente, resultado;
        Scanner entrada = new Scanner(System.in);
        String respuesta = "S";

        while (Objects.equals(respuesta, "S")) {
            System.out.print("Ingrese la base: ");
            base = entrada.nextInt();
            System.out.print("Ingrese el exponente: ");
            exponente = entrada.nextInt();

            resultado = Math.pow(base, exponente);

            System.out.println("Resultado: " + resultado);

            System.out.println("Desea repetir la operacion? <S/N>");
            respuesta = entrada.next();



        }

        System.out.println("----------Fin del Programa----------");

    }
}






