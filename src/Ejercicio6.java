import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int num, resto;
        Scanner ent = new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero de 8 digitios: ");
            num = ent.nextInt();
        }while(num <10000000 || num >99999999);

        resto = num % 23;

        switch (resto){
            case 0 -> System.out.println( num+"A");

            case 1 -> System.out.println(num+"Q");

            case 2 -> System.out.println(num+"Z");

            case 3 -> System.out.println(num+"S");

            case 4 -> System.out.println(num+"X");

            case 5 -> System.out.println(num+"W");

            case 6 -> System.out.println(num+"D");

            case 7 -> System.out.println(num+"C");

            case 8 -> System.out.println(num+"E");

            case 9 -> System.out.println(num+"F");

            case 10 -> System.out.println(num+"B");

            case 11 -> System.out.println(num+"R");

            case 12 -> System.out.println(num+"G");

            case 13 -> System.out.println(num+"T");

            case 14 -> System.out.println(num+"B");

            case 15 -> System.out.println(num+"H");

            case 16 -> System.out.println(num+"Y");

            case 17 -> System.out.println(num+"N");

            case 18 -> System.out.println(num+"U");

            case 19 -> System.out.println(num+"M");

            case 20 -> System.out.println(num+"I");

            case 21 -> System.out.println(num+"L");

            case 22 -> System.out.println(num+"O");
        }

        System.out.println("----------Fin del Programa----------");









    }
}
