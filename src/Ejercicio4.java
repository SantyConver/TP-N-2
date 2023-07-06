import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int num, copia, inverso = 0, resto;
        Scanner ent = new Scanner(System.in);

            System.out.print("Introduce un número15: ");
            num = ent.nextInt();


        copia = num;
        while (copia!=0){
            resto = copia % 10;
            inverso = inverso * 10 + resto;
            copia = copia / 10;
        }

        if(num == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
}