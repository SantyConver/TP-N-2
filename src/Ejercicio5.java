import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

    int numero, unidades = 0, decenas = 0;
    Scanner ent = new Scanner(System.in);

        System.out.print("Ingrese un numero del 1 al 99: ");
        numero = ent.nextInt();

      decenas = numero % 10;
      unidades = numero / 10;

        if (decenas < 1) {
            switch (unidades) {
                case 1 -> System.out.print("Uno");

                case 2 -> System.out.print("Dos");

                case 3 -> System.out.print("Tres");

                case 4 -> System.out.print("Cuatro");

                case 5 -> System.out.print("Cinco");

                case 6 -> System.out.print("Seis");

                case 7 -> System.out.print("Siete");

                case 8 -> System.out.print("Ocho");

                case 9 -> System.out.print("Nueve");
            }
        }

        if (decenas == 1 && unidades <6){
            switch (numero){
                case 1 -> System.out.print("Once");

                case 2 -> System.out.print("Doce");

                case 3 -> System.out.print("Trece");

                case 4 -> System.out.print("Catorce");

                case 5 -> System.out.print("Quince");

            }

        }


    }
}
