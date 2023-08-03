import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int horas, minutos,segundos;

        System.out.print("Ingrese las horas   : ");
        horas = ent.nextInt();

        System.out.print("Ingrese los minutos : ");
        minutos = ent.nextInt();

        System.out.print("Ingrese los segundos: ");
        segundos = ent.nextInt();
        System.out.printf("La hora ingresada fue: [%02d:%02d:%02d]\n",horas, minutos, segundos);
        segundos ++;

        if (segundos ==60){

            segundos =0;

            minutos++;
        }
        if (minutos ==60){

            minutos =0;

            horas++;
        }
        if (horas ==24){

            horas=0;


        }
        System.out.printf("La hora un segundo mas tarde es: [%02d:%02d:%02d]",horas, minutos, segundos);
        System.out.println("----------Fin del Programa----------");
    }
}
