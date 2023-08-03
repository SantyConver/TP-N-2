import java.util.Scanner;
import java.util.Objects;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String letra;
        System.out.print("ingrese una letra para determinar si es o no vocal: ");
        letra = entrada.next();
        detectorVocal(letra);

        System.out.println("----------Fin del Programa----------");


    }
    public static void detectorVocal(String letra){
        if (Objects.equals(letra, "a") || (Objects.equals(letra, "e") || (Objects.equals(letra, "i") || (Objects.equals(letra, "o") || (Objects.equals(letra, "u")))))){
            System.out.println("¡Es vocal!");
        }
    }



}
