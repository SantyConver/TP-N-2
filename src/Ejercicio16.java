import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        int inicio, fin;
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingrese el mensaje a mostrar por pantalla: ");
        String mensaje = ent.nextLine();

        System.out.print("Por favor ingrese el valor de \"inicio\": ");
        inicio = ent.nextInt();

        System.out.print("Por favor ingrese el valor de \"fin\": ");
        fin = ent.nextInt();



        eco(inicio, fin, mensaje);



    }


    public static void eco (int inicio, int fin, String mensaje){

        while(inicio <= fin) {
            System.out.print(mensaje+" ");
            inicio ++;

        }

        System.out.print("----------Fin del Programa----------");



    }




}
