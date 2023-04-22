package dz_1_sem_1;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        /*
         * Реализовать простой калькулятор (введите первое число, введите второе число, 
         * введите требуемую операцию, ответ)
         */
        double num1;
        double num2;
        double resul;
        char symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        num2 = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        symbol = scanner.next().charAt(0);
        switch(symbol) {
           case '+': resul = num1 + num2;
              break;
           case '-': resul = num1 - num2;
              break;
           case '*': resul = num1 * num2;
              break;
           case '/': resul = num1 / num2;
              break;
           default:  System.out.printf("Ошибка! неправельная операция: ");
              return;
        }
        System.out.print(num1 + " " + symbol + " " + num2 + " = " + resul);
    }
}
    
