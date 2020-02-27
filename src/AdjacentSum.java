/**
 * This is the problem from book survey 5 about
 * summing adjacent numbers
 */
public class AdjacentSum {
    public static double[] getSumAdjacent(double[] x) {
        double[] y = new double[x.length-1];
        for (int i = 0; i < y.length; i++) {
            y[i] = x[i] + x[i+1];
        }
        return y;
    }
    
    public static void main(String[] args) {
        double[] x = {3, 4, 13, 1, 7, 12, 22, 11};
        double[] result = getSumAdjacent(x);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
