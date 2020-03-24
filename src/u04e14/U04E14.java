
package u04e14;

import java.util.Scanner;

public class U04E14 {

    public static void main(String[] args) {
       char numero;
       String mensaje1="La letra ";
       String mensaje2=" corresponde al numero ";
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese el numero romano a convertir: ");
       numero=entrada.next().charAt(0);
       switch (numero){
            case 'I':
               System.out.print(mensaje1+numero+mensaje2+"1"); break;
            case 'V':
               System.out.print(mensaje1+numero+mensaje2+"5"); break;
            case 'X':
               System.out.print(mensaje1+numero+mensaje2+"10"); break;
            case 'L':
               System.out.print(mensaje1+numero+mensaje2+"50"); break;
            case 'C':
               System.out.print(mensaje1+numero+mensaje2+"100"); break;
            case 'Q':
               System.out.print(mensaje1+numero+mensaje2+"500"); break;
            case 'M':
               System.out.print(mensaje1+numero+mensaje2+"1000"); break;
               default:
               System.out.print("La letra ingresada no corresponde a un numero");
       }
    }
}