public class Main {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        LinearRegression slr = new LinearRegression(dataSet);

        double[] advertising = dataSet.getX();
        double[] sales = dataSet.getY();

        double[] hatY = Predicts.calculateHatY(slr);

        double xValue = 25.0;

        double[][] data = new double[advertising.length][3];

        for (int i = 0; i < advertising.length; i++) {
            data[i][0] = advertising[i];
            data[i][1] = sales[i];
            data[i][2] = hatY[i];
        }

        System.out.println("+------------+------------+------------+");
        System.out.println("| Advertising| Sales      | HatY       |");
        System.out.println("+------------+------------|------------+");

        for (int i = 0; i < advertising.length; i++) {
            System.out.println("| " + data[i][0] + "         | " + data[i][1] + "    | " + data[i][2] + "    |");
        }

        System.out.println("+------------+------------+------------+");

        System.out.println("\nY = beta1 * advertising (x) + beta0");
        System.out.println("Y = " + slr.getBeta1() + " * advertising (x) + " + slr.getBeta0() + "\n");

        double hatYForX = Predicts.predict(slr, xValue); // Llama a Predicts.predict
        System.out.println("HatY for x = " + xValue + " Y: " + hatYForX + "\n");
    }
}
