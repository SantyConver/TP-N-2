import java.util.Objects;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int operando1 = 1, operando2, resu;
        String operador;



        while (operando1 != 0) {
            System.out.print("Ingrese el primer operando: ");
            operando1 = entrada.nextInt();

            //operador= elegirOperador();
            System.out.print("Ingrese el operador: ");
            operador = entrada.next();

            System.out.print("Ingrese el segundo operando:  ");
            operando2 = entrada.nextInt();

            if(operando1 != 0){
                if(Objects.equals(operador, "+")){
                    resu = operando1 + operando2;
                    System.out.println("Resultado: "+resu);
                }
                else if(Objects.equals(operador, "-")){
                    resu = operando1 - operando2;
                    System.out.println("Resultado: "+resu);
                }
                else if(Objects.equals(operador, "*")){
                    resu = operando1 * operando2;
                    System.out.println("Resultado: "+resu);
                }
                else if(Objects.equals(operador, "/")){
                    resu = operando1 / operando2;
                    System.out.println("Resultado: "+resu);
                }

            }
        }
        System.out.println("----------Fin del Programa----------");

    }

}