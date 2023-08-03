import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
        Realizar un programa en Java que dado un rango de números enteros positivos, muestre la cantidad de números pares entre ellos.
        Terminar el programa cuando se ingrese numero inicial o final menor a 0
         */
        int inicio, fin, num = 0, contador = 0;
        Scanner ent = new Scanner(System.in);


        System.out.print("Ingrese el numero inicial: ");
        inicio = ent.nextInt();
        System.out.print("Ingrese el numero final: ");
        fin = ent.nextInt();

        while (inicio >= 0 && fin >= 0) {

            while (num <= fin) {

                if (num >= inicio) {
                    contador++;
                }

                num = num + 2;


            }
            System.out.println("Cantidad: " + contador);
            contador = 0;
            num = 0;
            System.out.print("Ingrese el numero incial: ");
            inicio = ent.nextInt();
            System.out.print("Ingrese el numero final: ");
            fin = ent.nextInt();


        }
        System.out.println("----------Fin del Programa----------");
    }
}