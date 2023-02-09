public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[] {5000, 8, 415, 651, 1568});//созд.новый тип данных
        long max = salesManager.max();//созд. переменную
        System.out.println(max);//выводим
    }
}
