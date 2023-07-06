import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

    int numero, unidades = 0, decenas = 0;
    Scanner ent = new Scanner(System.in);
        do {

            System.out.print("Ingrese un numero del 1 al 99: ");
            numero = ent.nextInt();
        }while (numero <1 || numero >99);
      decenas = numero / 10;
      unidades = numero % 10;


          switch (decenas){
              case 0: {
                  System.out.println("");
                  break;
              }
              case 1: {
                  if (unidades ==0){
                  System.out.println("Diez");
              } else if (unidades <=5) {
                  switch (unidades) {
                      case 1:{
                          System.out.println("Once");
                          break;
                      }

                      case 2:{
                          System.out.println("Doce");
                          break;
                      }

                      case 3:{
                          System.out.println("Trece");
                          break;
                      }

                      case 4:{
                          System.out.println("Catorce");
                          break;
                      }

                      case 5:{
                          System.out.println("Quince");
                          break;
                      }

                      default:{
                          System.out.print("Dieci ");
                          break;
                      }

                  }

                  }
              }

                  case 2:{
                      if (unidades == 0){
                          System.out.print("Veinte");

                      }else if(decenas ==2){

                          System.out.print("Veinti");
                          break;
                      }
                  }

              case 3:{
                  if (unidades == 0){
                      System.out.print("Treinta");
                  }else if(decenas ==3){
                      System.out.print("Treinta y ");
                      break;
                  }
                  break;
              }

              case 4:{
                  if (unidades == 0){
                      System.out.print("Cuarenta");
                  }else if(decenas ==4) {
                      System.out.print("Cuarenta y ");
                      break;
                  }
              }

              case 5:{
                  if (unidades == 0){
                      System.out.print("Cincuenta");
                  }else if(decenas ==5) {
                      System.out.print("Cincuenta y ");
                      break;
                  }
              }

              case 6:{
                  if (unidades == 0){
                      System.out.print("Sesenta");
                  }else if(decenas ==6) {
                      System.out.print("Sesenta y ");
                      break;
                  }
              }

              case 7:{
                  if (unidades == 0){
                      System.out.print("Setenta");
                  }else if(decenas ==7) {
                      System.out.print("Setenta y ");
                      break;
                  }
              }

              case 8: {
                  if (unidades == 0) {
                      System.out.print("Ochenta");
                  } else if (decenas == 8) {
                      System.out.print("Ochenta y ");
                      break;
                  }
              }

              case 9:{
                  if (unidades == 0){
                      System.out.print("Noventa");
                  }else if(decenas ==9) {
                      System.out.print("Noventa y ");
                      break;
                  }
              }
          }
          if (numero <10 || numero >15)
          switch (unidades){
              case 1 -> System.out.print("Uno");

              case 2 -> System.out.print("Dos");

              case 3 -> System.out.print("Tres");

              case 4 -> System.out.print("Cuatro");

              case 5 -> System.out.print("Cinco");

              case 6 -> System.out.print("Seis");

              case 7 -> System.out.print("Siete");

              case 8 -> System.out.print("Ocho");

              case 9 -> System.out.print("Nueve");

          }

































        /*if (decenas <1 ) {
            switch (unidades) {
                case 1 -> System.out.print("Uno");

                case 2 -> System.out.print("Dos");

                case 3 -> System.out.print("Tres");

                case 4 -> System.out.print("Cuatro");

                case 5 -> System.out.print("Cinco");

                case 6 -> System.out.print("Seis");

                case 7 -> System.out.print("Siete");

                case 8 -> System.out.print("Ocho");

                case 9 -> System.out.print("Nueve");
            }
        }

        if (decenas == 1 && unidades <6){
            switch (numero){
                case 1 -> System.out.print("Once");

                case 2 -> System.out.print("Doce");

                case 3 -> System.out.print("Trece");

                case 4 -> System.out.print("Catorce");

                case 5 -> System.out.print("Quince");

            }

        }*/


    }
}
