import java.util.Random;

public class Ejercicio6_TP3 {
    public static void main(String[] args) {
        int[][] matrizA = new int[100][200];
        int[][] matrizB = new int[200][100];

        inicializarMatriz(matrizA);
        inicializarMatriz(matrizB);

        System.out.println("Matriz A antes del intercambio: ");
        mostrarMatriz(matrizA);
        System.out.println();

        System.out.println("Matriz B antes del intercambio: ");
        mostrarMatriz(matrizB);
        System.out.println();

        //intercambio
        HiloFilaIntercambio[] hilos = new HiloFilaIntercambio[matrizA.length];
        for (int i = 0; i < matrizA.length; i++) {
            hilos[i] = new HiloFilaIntercambio(matrizA, matrizB, i);
            hilos[i].start();
        }

        for (int i = 0; i < hilos.length; i++) {
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Matriz A despues del intercambio: ");
        mostrarMatriz(matrizA);
        System.out.println();

        System.out.println("Matriz B despues del intercambio: ");
        mostrarMatriz(matrizB);
        System.out.println();

    }

    public static void inicializarMatriz(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
