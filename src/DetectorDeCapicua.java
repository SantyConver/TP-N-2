import java.util.Scanner;
public class DetectorDeCapicua {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num, copianum, inverso, ultimonum;
        inverso = 0;

        System.out.println("----------Detector de Capicúa----------");

        System.out.println("Iingrese un num del 0 al 9999:");
        System.out.print("-> # ");
        num = entrada.nextInt();

        copianum = num;

        while(copianum >0){
            ultimonum = copianum % 10;
            copianum = copianum / 10;
            inverso = inverso * 10 + ultimonum;

        }

        if (inverso == num){
            System.out.println("----------Es Capicúa----------");
        }else{
            System.out.println("----------No es Capicúa----------");
        }




    }

}
