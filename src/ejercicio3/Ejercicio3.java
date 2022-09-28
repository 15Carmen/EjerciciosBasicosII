package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables
        int num;
        boolean numPar;
        //String res;

        //Le pedimos al usuario que introduzca un número
        System.out.println("Introduzca un número cualquiera");
        num=sc.nextInt();

        //Indicamos que num debe ser par
        num %=2;

        //Indicamos que numPar es cierto cuando num es igual a 0
        numPar= num==0 ? true:false;

        /**
         * res = (num%2==0 ? "es par" : "es impar")
         */

        //Imprimimos por consola si el numero es par o no
        System.out.println(numPar); //sout(res)




    }
}
