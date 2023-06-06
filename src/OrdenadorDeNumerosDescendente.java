import java.util.Scanner;
public class OrdenadorDeNumerosDescendente {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese un numero  : ");
        num1 = ent.nextInt();
        System.out.print("Ingrese otro numero: ");
        num2 = ent.nextInt();

        if (num1 <= num2){
            System.out.println(num2+", "+num1);
        }
        else{
            System.out.println(num1+", "+num2);
        }
        System.out.println("--------El programa finalizo--------");






    }

}
