package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Declaro el Scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int edad;
        boolean mayorEdad;

        //Le pedimos al usuario su edad
        System.out.println("Introduzca su edad");
        edad=sc.nextInt();

        //Indicamos que la mayoría de edad es a los 18
        mayorEdad=edad<=18;

        //Mosttramos si es mayor de edad por consola. Si es menor nos aparecerá true y si es mayor false
        System.out.println(mayorEdad);

    }
}
