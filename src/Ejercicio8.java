import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        /*Realizar un programa en Java que halle cuántos múltiplos de N hay en un rango de números.
           Terminar el programa cuando se ingrese numero inicial o final menor o igual a 0:
         */
        int inicio, num = 0, fin, multiplo, contador = 0;

        Scanner ent = new Scanner(System.in);
        System.out.print("Ingrese el numero incial: ");
        inicio = ent.nextInt();
        System.out.print("Ingrese el numero final: ");
        fin = ent.nextInt();
        System.out.print("Ingrese el multiplo (N): ");
        multiplo = ent.nextInt();

        while (inicio > 0 && fin > 0) {

            while (num <= fin) {

                if (num >= inicio) {
                    contador++;
                }

                num = num + multiplo;


            }
            System.out.println("Cantidad: " + contador);
            contador = 0;
            num = 0;
            System.out.print("Ingrese el numero incial: ");
            inicio = ent.nextInt();
            System.out.print("Ingrese el numero final: ");
            fin = ent.nextInt();
            System.out.print("Ingrese el multiplo (N): ");
            multiplo = ent.nextInt();

        }
        System.out.println("----------Fin del Programa----------");
    }

}

