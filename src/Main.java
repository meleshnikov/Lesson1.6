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
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

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