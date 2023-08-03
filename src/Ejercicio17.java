import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, intermedios;

        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        numerosIntermedios(num1, num2);


        System.out.println("----------Fin del Programa----------");

    }

    public static void numerosIntermedios(int num1, int num2){
        int contador;

        if (num1 > num2){
            System.out.print("Los numeros intermedios son: ");
            num1--;
            contador = num2;
            do {
                contador++;
                if(contador < num1) {
                    System.out.print(contador + ", ");
                } else if (contador == num1) {
                    System.out.print(contador+". ");
                }
            }while (contador < num1);

        } else{
            System.out.print("Los numeros intermedios son: ");
            num2--;
            contador = num1;
            do {
                contador++;
                if(contador < num2) {
                    System.out.print(contador + ", ");
                } else if (contador == num2) {
                    System.out.print(contador+". ");
                }
            }while (contador < num2);

        }





    }


}
