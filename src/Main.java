import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int salarySum = 0;
        for (int salary : salaryArray) {
            salarySum += salary;

        }
        System.out.println("Сумма трат за месяц " + salarySum + " рублей");
    }

    private static void task2() {
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int minSalary = 200_000;
        int maxSalary = 0;

        for (int i : salaryArray) {
            if (i < minSalary) {
                minSalary = i;
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + minSalary + " рублей");
        for (int d : salaryArray) {
            if (d > maxSalary) {
                maxSalary = d;
            }

        }
        System.out.println("Максимальная сумма трат за месяц составила " + maxSalary + " рублей");
    }

    private static void task3() {
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        double midSum = 0;
        int salarySum = 0;
        for (int salary : salaryArray) {
            salarySum += salary;
        }
        midSum = salarySum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + midSum + " рублей");

    }
    private static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName.length-1; i >=0 ; i --) {
            System.out.print(reverseFullName[i]);
        }

    }

}
