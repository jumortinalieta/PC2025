public class HiloRoot extends Thread{
    private int root;

    public HiloRoot(int root) {
        this.root = root;
    }

    @Override
    public void run() {
        System.out.println("Resultado para root " + root + " = " + SumRootN(root));
    }

    public double SumRootN(int root) {
        double result = 0;
        for (int i = 0; i < 10000000;i++) {
            result += Math.exp(Math.log(i) / root);
        }
        return result;
    }
}
