package ru.netology.stats;

public class StatsService {
    /* Метод для вычисления суммы всех продаж */
    public int totalSales(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        return total;
    }

    /* Метод для вычисления средней суммы продаж в месяц */
    public int averageSales(int[] sales) {
        return totalSales(sales) / sales.length;
    }


    /* Метод для определения номера месяца, в котором был пик продаж */
    public int maxSales(int[] sales) {
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

    /* Метод для определения номера месяца, в котором были минимальные продажи */
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }



}
