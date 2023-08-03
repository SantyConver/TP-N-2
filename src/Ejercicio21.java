import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean respuesta;


        System.out.print("Ingrese un numero para determinar si es o no es primo: ");
        num = entrada.nextInt();

        respuesta= detectoNumeroPrimo(num);

        if (respuesta == true){
            System.out.println("¡Es primo!");
        }else{
            System.out.println("¡No es primo!");
        }

        System.out.println("----------Fin del Programa----------");








    }
    public static boolean detectoNumeroPrimo(int num) {
        for(int i=2;i<num;i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }

}
