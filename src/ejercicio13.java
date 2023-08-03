import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, num2, aux;


        System.out.print("Ingrese un numero: ");
        num = ent.nextInt();
        num2 = aux = num;
        for (int i = 1; i <= num2; i++) {
            String imprimir = "";
            for (int p = 1; p <= aux; p++) {
                imprimir = imprimir + "*";
                imprimir = imprimir + " ";

            }
            System.out.println(imprimir);
            aux = aux - 1;

        }
        System.out.println("----------Fin del Programa----------.");
    }
}
