import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
        int inicio, fin;
        Scanner ent = new Scanner(System.in);
        System.out.print("Por favor ingrese el valor de \"inicio\": ");
        inicio = ent.nextInt();

        System.out.print("Por favor ingrese el valor de \"fin\": ");
        fin = ent.nextInt();


        eco(inicio, fin);




    }

    public static void eco(int inicio, int fin){

        while(inicio <= fin) {
            System.out.print("Eco... ");
            inicio ++;

        }

        System.out.print("----------Fin del Programa----------");






    }



}
