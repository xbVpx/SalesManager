public class SalesManager {
    protected int[] sales;
    public SalesManager(int[] sales) {
        this.sales = sales;
    }
    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int medium() {
        int max = 0;
        int min = sales[0];
        int medium = 0;
        for (int sale : sales) {
            medium += sale;
            if (sale > max) max = sale;
            if (sale < min) min = sale;
        }
        return medium = (medium - min - max) / (sales.length - 2);
    }
}

