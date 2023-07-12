import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        int veces;
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingrese el mensaje a mostrar por pantalla: ");
        String mensaje = ent.nextLine();

        System.out.print("Por favor ingrese el valor de \"veces\": ");
        veces = ent.nextInt();




        eco(veces, mensaje);



    }


    public static void eco (int inicio, String mensaje){

        for (int i = 0; i <= inicio; i++) {
            System.out.print(mensaje + " ");
        }



        System.out.print("----------Fin del Programa----------");



    }




}
