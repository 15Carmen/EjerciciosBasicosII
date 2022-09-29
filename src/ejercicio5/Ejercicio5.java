package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables
        int nota1, nota2, nota3;
        double media;

        //Solicitar al usuario que introduzca las notas enteras de los tres trimestres
        System.out.println("Introduzca la nota que obtuvo en el 1ºTrimestre: ");
        nota1= sc.nextInt();
        System.out.println("Introduzca la nota que obtuvo en el 2ºTrimestre: ");
        nota2= sc.nextInt();
        System.out.println("Introduzca la nota que obtuvo en el 3ºTrimestre: ");
        nota3= sc.nextInt();

        //Calculamos la media de las notas casteando los numeros enteros para que la nota pueda darnos decimales
        media=(double) (nota1+nota2+ nota3)/3;

        //Imprimimos por consola la media
        System.out.println("Tu media del curso es: "+media);

        //Imprimimos por consola la media del boletín casteando la media a int para no tener decimales
        System.out.println("En su boletín tendrá: "+(int)media);
    }
}
