import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {

        double valores, sumaValores = 0 , raices, sumaRaices = 0, promedio;
        int contador = 1;
        Scanner entrada = new Scanner(System.in);


        System.out.print("Ingrese un numero entre 0 y 32,1: ");
        valores = entrada.nextInt();
        sumaValores = sumaValores + valores;
        while(valores > 0 && valores <= 32.1){

            valores = entrada.nextInt();
            sumaValores = sumaValores + valores;
            if(valores > 32.1){
                System.out.print("\nPor favor ingrese un numero menor a 32,1: ");
                valores = entrada.nextInt();
            }
            raices = Math.sqrt(valores);
            sumaRaices = sumaRaices + raices;
            contador ++;
        }
        promedio = sumaValores/contador;
        System.out.println("La suma de las raices cuadradas es : "+sumaRaices);
        System.out.println("El promedio de los valores ingresados es: "+promedio);

        System.out.println("----------Fin del Programa----------");
    }
}
