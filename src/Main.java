import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("Task 1");
        int daysInMonth = 30;
        int costsPerDay[] = generateRandomArray(daysInMonth);
        int sum = 0;
        for (int i = 0; i < costsPerDay.length; i++) {
            sum += costsPerDay[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Task2
        System.out.println("\nTask 2");
        int max = costsPerDay[0];
        int min = costsPerDay[0];
        int maxDay = 0;
        int minDay = 0;

        for (int i = 0; i < costsPerDay.length; i++) {
            if (min > costsPerDay[i]) {
                min = costsPerDay[i];
                minDay = i + 1;
            }
            if (max < costsPerDay[i]) {
                max = costsPerDay[i];
                maxDay = i + 1;
            }
        }

        System.out.print("Минимальная сумма трат за " + minDay + "-ое число составила " + min + " рублей. ");
        System.out.println("Максимальная сумма трат за " + maxDay + "-ое число составила " + max + " рублей.");

        //Task3
        System.out.println("\nTask 3");
        double average = (double) sum / (double) costsPerDay.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        //Task4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        // 1 вариант
        // просто печатаем массив в обратном порядке
        System.out.println("\nTask 4 \n1 вариант");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        // 2 вариант
        // меняем местами элементы массива
        System.out.println("\n\n2 вариант");
        for (int i = 0, j = reverseFullName.length - 1; i < j; i++, j--) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[j];
            reverseFullName[j] = temp;
        }
        for (char symbols : reverseFullName) {
            System.out.print(symbols);
        }


    }

    public static int[] generateRandomArray(int days) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[days];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}