public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[] {5000, 415, 651, 1568});

        int max = salesManager.max();
        int min = salesManager.min();
        int average = salesManager.average();

        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}
