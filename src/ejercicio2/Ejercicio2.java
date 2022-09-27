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
        mayorEdad=(edad>=18);

        edad=mayorEdad? 1:0;
        
/**
        if (edad==1){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Estas chiquito");
        }
*/
    }
}
