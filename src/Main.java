public class Main {
    public static void main(String[] args) {
        long[] sales = {125, 386, 465, 789, 366, 984};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}