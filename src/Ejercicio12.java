import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, contador = 0, aux = 1;

        System.out.println("Ingrese un numero para determinar si es primo");
        num = entrada.nextInt();

        while(aux <=num){
            if (num % aux == 0){
                contador++;
            }
            aux++;
        }
        if (contador == 2){
            System.out.println("¡Es primo!");
        }else {
            System.out.println("¡No es primo!");
        }

    }

}
