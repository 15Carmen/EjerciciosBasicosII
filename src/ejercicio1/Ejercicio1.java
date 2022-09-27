package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Declaro el Scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        double manzana, pera, precioTotal;

        //Declaración de constantes
        final double PRECIO_MANZANA=2.35;
        final double PRECIO_PERA=1.95;

        /**
         * Le pedimos al usuario que introduzca los kilos de manzanas y peras vendidos ese semestre y guardamos
         * las respuestas en las variables anteriormente declaradas
         */
        System.out.println("Introduzca los kilos de manzanas vendidos este semestre: ");
        manzana=sc.nextDouble();
        System.out.println("Introduzca los kilos de peras vendidos este semestre: ");
        pera=sc.nextDouble();

        /**
         * Calculamos el precio total multiplicando el numero de kilos introducido por lo que cuesta 1 kilo de
         * cada fruta. El precio total es la suma de ambos resultados
         */
        manzana*=PRECIO_MANZANA;
        pera*=PRECIO_PERA;
        precioTotal=manzana+pera;

        //Mostramos por consola el precio total
        System.out.println("Se han recaudado "+precioTotal);
    }
}