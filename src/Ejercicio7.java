import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        int num, suma, contador, contador2;
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = ent.nextInt();
        contador = 2;
        contador2 = 1;
        suma = 1;



        while(contador2<num){
               suma = suma + contador;
               System.out.print(contador2+" + ");
               contador++;
               contador2++;


               if(contador2 == num ){
                   System.out.print( contador2+" = "+suma);
               }


          }


    }
}
