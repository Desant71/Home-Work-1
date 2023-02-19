public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[] {5000, 415, 651, 1568});

        long max = salesManager.max();
        long min = salesManager.min();
        long average = salesManager.average();

        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}
