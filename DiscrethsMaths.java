public class DiscrethsMaths {
    public static double calculateSumOfSquares(double[] data) {
        double sum = 0.0;
        double mean = LinearAlgebra.calculateMean(data);
        for (double value : data) {
            sum += (value - mean) * (value - mean);
        }
        return sum;
    }
}
