package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Declaro el scanner par apoder leer por consola
        Scanner sc = new Scanner(System.in);

        //Declaro las variables
        boolean lluvia, tarea, biblio, salir;

        //Le preguntamos al ususario si llueve, si ha hecho la tarea y si tiene que ir a la biblioteca
        System.out.println("¿Está lloviendo? Conteste con true o false");
        lluvia= sc.nextBoolean();
        System.out.println("¿Has hecho la tarea? Conteste con true o false");
        tarea= sc.nextBoolean();
        System.out.println("¿Tienes que ir a la biblioteca? Conteste con true o false");
        biblio= sc.nextBoolean();

        // si no está lloviendo y he hecho la tarea o no tengo que ir a la biblioteca puedo salir
        salir= (!lluvia&&tarea || biblio);
        System.out.println("¿Puedes salir? "+salir);



    }
}
