import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sumAllSales = 0;

        for (int sale : sales) {
            sumAllSales += sale;
        }
        System.out.println("Общая сумма продаж " + sumAllSales);

        int averageSales = 0;

        for (int sale : sales) {
            averageSales = sumAllSales / sales.length;
        }
        System.out.println("Средняя сумма продаж " + averageSales);

        int maxMonth = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        System.out.println("Последний месяц максимальных продаж " + maxMonth);

        int minMonth = 0;
        int month1 = 0;

        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month1;
            }
            month1 = month1 + 1;
        }
        System.out.println("Последнйи месяц минимальных продаж " + minMonth);

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int count1 = 0;
        int count2 = 0;

        for (int sale : sales) {
            if (sale < sum / sales.length) {
                count1++;
                break;
            } else {
                if (sale > sum / sales.length) {
                    count2++;
                    break;
                }
            }
            System.out.println("Месяц(ы) в которых продажи были ниже среднего" + count1 +
                    "\nМесяц(ы) в которых продажи были выше среднего" + count2);
        }
    }
}
