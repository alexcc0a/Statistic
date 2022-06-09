package ru.netology.stats;

public class StatsService {

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double averageSales(double[] sales) {
        double averageSales = 0;
        for (double sale : sales) {
            averageSales += sale / sales.length;
        }
        return averageSales;
    }

    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public double underAverage(double[] sales) {
        double underMonths = 0;
        for (double sale : sales) {
            if (sale < averageSales(sales)) {
                underMonths = underMonths + 1;
            }
        }
        return underMonths;
    }

    public double upperAverage(double[] sales) {
        double upperMonth = 0;
        for (double sale : sales) {
            if (sale > averageSales(sales)) {
                upperMonth = upperMonth + 1;
            }
        }
        return upperMonth;
    }
}
