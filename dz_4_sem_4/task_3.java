package dz_4_sem_4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        inputLinkedList(list);
        System.out.println(list);
        System.out.println(sumLinkedList(list));
    }

    static void inputLinkedList(LinkedList<Integer> list){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("size: ");
            int size = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < size; i++) {
                System.out.print("#" + i + ": ");
                list.add(Integer.parseInt(scanner.nextLine()));
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    static int sumLinkedList(LinkedList<Integer> array){
        int sum = 0;
        ListIterator<Integer> iterator = array.listIterator(0);
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
}