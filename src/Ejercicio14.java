import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {

        double valores, raices, sumaRaices = 0;
        int contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entre 0 y 32,1: ");
        valores = entrada.nextInt();

        if(valores >32.1){
            System.out.print("Por favor ignrese un numero entre 0 y 32,1: ");
            valores = entrada.nextInt();
        }

        if (valores >=0 && valores <=32.1){
            do {

                System.out.print("Ingrese un numero entre 0 y 32,1: ");
                valores = entrada.nextInt();
                if (valores >32.1){
                    System.out.print("Por favor ingrese un numero entre 0 y 32,1: ");
                }

                raices = Math.sqrt(valores);
                System.out.println("La raiz cuadrada de "+valores+" es: "+raices);

                sumaRaices = sumaRaices + raices;

                contador++;
                if (valores <0){
                    System.out.println("la suma de los resultados de las raices es: "+sumaRaices);


                }
                //falta hacer la parte final de este ejercicio y probar como funciona.

            } while (valores >= 0);


        }

    }
}
