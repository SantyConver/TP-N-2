import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();

        determinarMayor(num1, num2);

        System.out.println("----------Fin del Programa----------");






    }

    public static void determinarMayor(int num1, int num2){

        if (num1 > num2){
            System.out.print("El numero mayor es: "+num1);
        }else{
            System.out.print("El numero mayor es: "+num2);
        }



    }



}
