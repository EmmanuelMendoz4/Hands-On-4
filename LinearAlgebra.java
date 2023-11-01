public class LinearAlgebra {
    public static double calculateMean(double[] data) {
        double sum = 0.0;
        for (double value : data) {
            sum += value;
        }
        return sum / data.length;
    }

    public static double calculateSum(double[] data) {
        double sum = 0.0;
        for (double value : data) {
            sum += value;
        }
        return sum;
    }
}
