import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int num, copia, inverso = 0, resto;
        Scanner ent = new Scanner(System.in);


        do {
            System.out.print("Introduce un número entre 0 y 9999: ");
            num = ent.nextInt();
        }while(num <0 || num >9999);

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