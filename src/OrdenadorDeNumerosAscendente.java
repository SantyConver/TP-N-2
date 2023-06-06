import java.util.Scanner;
public class OrdenadorDeNumerosAscendente {
    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    int num1, num2, num3;

        System.out.print("Ingrese el primer numero : ");
        num1 = ent.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = ent.nextInt();
        System.out.print("Ingrese el tercer numero : ");
        num3 = ent.nextInt();

        if (num1 <num2 && num1 <num3 && num2 < num3){
            System.out.println(num1+", "+num2+", "+num3);
        }







    }
}
