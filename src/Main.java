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

        /*
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
         */

        //Task 5
        System.out.println("\n\nTask 5");
        //matrix initialization
        int rowLength = 3;
        int columnLength = 3;
        int[][] matrix = new int[rowLength][columnLength];

        //matrix's diagonals filling
        int x = 1;
        for (int i = 0; i < Math.min(rowLength, columnLength); i++) {
            matrix[i][i] = x;
            matrix[i][columnLength - 1 - i] = x;
        }

        //print matrix
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }


        //Task 6
        System.out.println("\nTask 6");
        int[] sourceArray = {5, 4, 3, 2, 1};
        int[] resultArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            resultArray[i] = sourceArray[sourceArray.length - 1 - i];
        }
        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(resultArray));

        //Task 7
        System.out.println("\nTask 7");
        //int[] sourceArray = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sourceArray));
        for (int i = 0, j = sourceArray.length - 1; i < j; i++, j--) {
            int temp = sourceArray[i];
            sourceArray[i] = sourceArray[j];
            sourceArray[j] = temp;
        }
        System.out.println(Arrays.toString(sourceArray));

        //Task 8
        System.out.println("\nTask 8");
        int[] intArray = {-6, 2, 5, -8, 8, 6, 4, -7, 12, 1};
        int[] result = new int[2];
        int targetSum = -2;
        find:
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length ; j++) {
                if (intArray[i] + intArray[j] == targetSum ){
                    result[0] = intArray[i];
                    result[1] = intArray[j];
                    break find;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(result));

        //Task 9
        System.out.println("\nTask 9");
        //int[] intArray = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int[][] tempResult = new int[intArray.length][2];
        //int targetSum = -2;
        int row = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] + intArray[j] == targetSum) {
                    tempResult[row][0] = intArray[i];
                    tempResult[row][1] = intArray[j];
                    row++;
                }
            }
        }
        int[][] result1 = new int[row][2];
        for (int i = 0; i < row; i++) {
            result1[i] = tempResult[i];
        }
        System.out.println(Arrays.toString(intArray));
        //System.out.println(Arrays.deepToString(tempResult));
        System.out.println(Arrays.deepToString(result1));
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