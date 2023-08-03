import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        /*
        Realizar una función que reciba 3 números enteros y devuelva el máximo de ellos.
         */
        int num1, num2, num3;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num2 = entrada.nextInt();

        System.out.println("----------Fin del Programa----------");




    }
    public static void detectorDeNumeroMayor(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor numero ingresado es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor numero ingresado es: " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("El mayor numero ingresado es: " + num3);
        }


    }
}
