public class LinearRegression {
    private double beta0;
    private double beta1;
    private double sumYY;
    private double sumHatY;
    private double xBar;
    private double yBar;
    private DataSet dataSet;

    public LinearRegression(DataSet dataSet) {
        this.dataSet = dataSet;
        double[] x = dataSet.getX();
        double[] y = dataSet.getY();

        double n = x.length;
        double sumX = 0.0;
        double sumY = 0.0;
        double sumXX = 0.0;
        double sumXY = 0.0;
        sumYY = 0.0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXX += x[i] * x[i];
            sumXY += x[i] * y[i];
            sumYY += (y[i] - (sumY / n)) * (y[i] - (sumY / n));
        }

        xBar = sumX / n;
        yBar = sumY / n;

        beta1 = (sumXY - (n * (xBar * yBar))) / (sumXX - (n * (xBar * xBar)));
        beta0 = yBar - (beta1 * xBar);
        }

        public double predict(double x) {
            return beta0 + beta1 * x;
        }

        public double[] calculateHatY() {
            double[] x = dataSet.getX(); // Obtén los valores de x desde el DataSet
            double[] hatY = new double[x.length];

            for (int i = 0; i < x.length; i++) {
                hatY[i] = beta1 * x[i] + beta0; // Calcula hatY para cada valor de x
            }

            return hatY;
        }


        // Getters.
        public double getBeta0() {
            return beta0;  // Devuelve el valor de Beta0.
        }
    
        public double getBeta1() {
            return beta1;  // Devuelve el valor de Beta1.
        }
    
        public double getSumYY() {
            return sumYY;  // Devuelve la suma de los cuadrados de las diferencias entre Y y el promedio de Y.
        }
    
        public double getSumHatY() {
            return sumHatY; // Devuelve la suma de los productos de las diferencias entre X y el promedio de X, y las diferencias entre Y y el promedio de Y.
        }
    
        public double getXBar() {
            return xBar;   // Devuelve el promedio de X.
        }
    
        public double getYBar() {
            return yBar;   // Devuelve el promedio de Y.
        }

        public DataSet getDataSet() {
            return dataSet;
        }

    }