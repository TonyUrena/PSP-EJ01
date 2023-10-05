public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        Utilidades.arrayEnterosRand(numeros);
        for (int i = 0; i < numeros.length; i++) {

            double time = System.nanoTime();

            if (Utilidades.esPrimo(numeros[i])){
                System.out.println(numeros[i] + " es Primo.");
            } else {
                System.out.println(numeros[i] + " no es Primo.");
            }

            double lastTime = System.nanoTime();
            System.out.println("Numero: " + i + " : " + "Calculado en " + ((lastTime-time)/1000000000) + " segundos.") ;
        }
    }
}
