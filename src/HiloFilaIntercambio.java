public class HiloFilaIntercambio extends Thread {
    private int[][] matrizA;
    private int[][] matrizB;
    private int filaActual;

    public HiloFilaIntercambio(int[][] matrizA, int[][] matrizB, int filaActual) {
        this.matrizA = matrizA;
        this.matrizB = matrizB;
        this.filaActual = filaActual;
    }

    @Override
    public void run() {
        int[] filaAuxiliar = new int[matrizA[filaActual].length];

        for (int i=0; i<matrizA[filaActual].length; i++) {
            filaAuxiliar[i] = matrizA[filaActual][i];
        }

        //intercambio
        for (int i = 0; i < matrizA[filaActual].length; i++) {
            matrizA[filaActual][i] = matrizB[i][filaActual];
        }
        for (int i = 0; i < filaAuxiliar.length; i++) {
            matrizB[i][filaActual] = filaAuxiliar[i];
        }
    }
}
