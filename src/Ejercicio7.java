import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, contador = 1, resu = 0;

        System.out.print("Ingrese un numero: ");
        num = ent.nextInt();

        while(num != 0){
            if(contador == num){
                System.out.print(contador);
            }
            else{
                System.out.print(contador + " + ");
            }
            resu = resu + contador;
            contador++;
            if (contador > num){
                System.out.print(" = " + resu);
                resu = 0;
                contador = 1;
                System.out.print( "\ningrese un numero: ");
                num = ent.nextInt();
            }

        }

        System.out.println("\n----------Fin del Programa----------.");


    }
}
