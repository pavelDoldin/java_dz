package dz_1_sem_1;
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        /*
         * Вычислить n! (произведение чисел от 1 до n)
         */
        System.out.println("Введите n-ое число факториала :");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        int[] arr = new int[number];
        int sum = 1;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                sum = sum * arr[i];
            }
        System.out.println(sum);
    }
}
