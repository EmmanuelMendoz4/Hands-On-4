public class DataSet {
    private double[] advertising;  // Matriz en 'x'
    private double[] sales;        // Matriz en 'y' 

    public DataSet() {
        advertising = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9};          
        sales = new double[] { 5, 10, 15, 20, 25, 30, 35, 40, 45};     
    }

    public double[] getX() {
        return advertising;
    }

    public double[] getY() {
        return sales;
    }
}
