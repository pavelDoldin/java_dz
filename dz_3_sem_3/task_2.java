package dz_3_sem_3;

/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
 */

 import java.util.ArrayList;
 import java.util.Collections;
 
 public class task_2 {
     public static void main(String[] args) {
         ArrayList<Integer> array = createList(10, 100);
         System.out.println(array);
         int max = Collections.max(array);
         int min = Collections.min(array);
         float mean = mean(array);
         System.out.println("Max: " + max);
         System.out.println("Min: " + min);
         System.out.println("Mean: " + mean);
     }
 
     static ArrayList<Integer> createList(int size, int max) {
         ArrayList<Integer> array = new ArrayList<>();
         for (int i = 0; i < size; i++) {
             array.add((int) (Math.random() * max));
         }
         return array;
     }
 
     static float mean(ArrayList<Integer> array) {
         int sum = 0;
         for (int i = 0; i < array.size(); i++) {
             sum += array.get(i);
         }
         return  (float)sum / array.size();
     }
 }