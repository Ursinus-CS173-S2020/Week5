public class ParallelSum {
    /**
     * 
     * @param x An array of length N
     * @param y Another array of length N
     * @return An array which holds the element by element
     *         sum of x and y
     */
    public static double[] sumArrays(double[] x, double[] y) {
        double[] z;
        z = new double[x.length];
        for (int i = 0; i < z.length; i++) {
            z[i] = x[i] + y[i];
        }
        return z;
    }
    
    public static void main(String[] args) {
        double[] x = {3, 4, 13, 1, 7, 12, 22, 11};
        double[] y = {7, 12, 4, 10, 14, 25, -11, 0};
        double[] result = sumArrays(x, y);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
