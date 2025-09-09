public class Ejercicio5B_TP3 {
    public static void main(String[] args) {
        long inicio,fin;

        HiloRoot[] hilosArreglo = new HiloRoot[20];

        inicio = System.currentTimeMillis();

        for (int i = 0; i < 20; i++) {
            hilosArreglo[i] = new HiloRoot(i+1);
            hilosArreglo[i].start();
        }

        for (int i = 0; i < hilosArreglo.length; i++) {
            try {
                hilosArreglo[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        fin = System.currentTimeMillis();

        System.out.println("\nTiempo total de ejecución concurrente: " + (fin - inicio));

    }
}
