import java.util.Random;

public class Utilidades {

    public static void arrayEnterosRand(int[] num){
        // Rellena el array con numeros enteros aleatorios
        // hasta el 10% máximo que permita java en un integer de 32 bits
        // Originalmente se implementó con un long integer de 64 bits,
        // (el cuál es el mayor integer que soporta java), pero la resolución
        // de cada número primo con este algoritmo tardaba miles de horas)

        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(1, Integer.MAX_VALUE/10);
        }

    }

    public static boolean esPrimo(int num){
        // Comprueba si el numero es primo recorriendo todos los
        // enteros menores hasta 2

        boolean esPrimo = true;
        int i = num;

        double time = System.nanoTime();
        double lastTime;
        int numI = num;
        int deltaI;

        do {
            if(num % i != 0){
                esPrimo = false;
            }
            /*

            // Esta pieza de código calculaba la cantidad de horas
            // Que tomaba calcular cada numero primo long

            lastTime = System.nanoTime();

            if (((lastTime - time)/1000000000) > 10){
                deltaI = numI - i;
                time = lastTime;

                System.out.println(
                        "Tiempo restante: " +
                        i / deltaI / 10 * 60 * 60 +
                        " horas");

                numI = i;

                System.out.println(i);
                System.out.println(deltaI);
            }
            */
            i--;
        } while (i > 1);

        return esPrimo;
    }

}
