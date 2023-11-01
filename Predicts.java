public class Predicts {
    public static double[] calculateHatY(LinearRegression slr) {
        double[] x = slr.getDataSet().getX();
        double[] hatY = new double[x.length];

        for (int i = 0; i < x.length; i++) {
            hatY[i] = slr.getBeta1() * x[i] + slr.getBeta0();
        }

        return hatY;
    }

    public static double predict(LinearRegression slr, double x) {
        return slr.getBeta0() + slr.getBeta1() * x;
    }
}
