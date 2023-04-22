package dz_1_sem_1;
import java.util.Scanner;
/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */
public class task_1 {
    public static void main(String[] args) {
        System.out.println("Введите n-ое треугольное число :");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        int[] arr = new int[number];
        int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                sum = sum + arr[i];
            }
        System.out.println(sum);
    }
}
