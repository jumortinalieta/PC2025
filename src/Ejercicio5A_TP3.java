public class Ejercicio5A_TP3 {
    public static void main(String[] args) {
        long inicio, fin;
        inicio =  System.currentTimeMillis();

        for (int i = 1; i <= 20; i++) {
            System.out.println("Resultado para root " + i + " = " + SumRootN(i));
        }

        fin = System.currentTimeMillis();
        System.out.println("\nTiempo total de ejecución secuencial: " + (fin - inicio));
    }

    public static double SumRootN(int root) {
        double result = 0;
        for (int i = 0; i < 10000000;i++) {
            result += Math.exp(Math.log(i) / root);
        }
        return result;
    }
}
