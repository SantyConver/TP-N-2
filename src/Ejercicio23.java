import java.sql.SQLOutput;
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Elija la opcion a utilizar");

        System.out.println("Si desea llamar a eco presione \"1\" ");
        System.out.println("Si desea llamar a Detector de Numeros Intermedios presione \"2\" ");
        System.out.println("Si desea llamar a Detector de Numero Mayor Entre Dos Numeros presione \"3\" ");
        System.out.println("Si desea llamar a Detector de Vocales presione \"4\" ");
        System.out.println("Si desea salir presione \"5\" ");

        opcion = entrada.nextInt();

        while (opcion != 5) {




            switch (opcion){
                case 1:{
                    int inicio, fin;
                    System.out.print("ingrese inicio: ");
                    inicio = entrada.nextInt();
                    System.out.print("Ingrese fin: ");
                    fin = entrada.nextInt();
                    Ejercicio15.eco(inicio, fin);
                    break;
                }
                case 2:{
                    int num1, num2;
                    System.out.print("ingrese el primer numero: ");
                    num1 = entrada.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = entrada.nextInt();
                    Ejercicio17.numerosIntermedios(num1, num2);
                    break;
                }
                case 3:{
                    int num1, num2;
                    System.out.print("Ingrese el primer numero: ");
                    num1 = entrada.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = entrada.nextInt();

                Ejercicio18.determinarMayor(num1, num2);
                break;
                }
                case 4:{
                    String letra;
                    System.out.print("Ingrese el caracter a evaluar si es o no vocal: ");
                    letra = entrada.next();
                    Ejercicio20.detectorVocal(letra);
                    break;

                }
                case 5:{
                    break;
                }
            }
            if (opcion == 5){
                break;
            }


            System.out.println("\nElija la opcion a utilizar");

            System.out.println("Si desea llamar a eco presione \"1\" ");
            System.out.println("Si desea llamar a Detector de Numeros Intermedios presione \"2\" ");
            System.out.println("Si desea llamar a Detector de Numero Mayor Entre Dos Numeros presione \"3\" ");
            System.out.println("Si desea llamar a Detector de Vocales presione \"4\" ");
            System.out.println("Si desea salir presione \"5\" ");

            opcion = entrada.nextInt();
        }




    }
}
