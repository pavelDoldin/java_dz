package dz_4_sem_4;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя.
 */

 import java.util.LinkedList;

 public class Que {
     LinkedList<Integer> list = new LinkedList<>();
 
     public void enqueue(int item){
         list.addLast(item);
     }
     public int dequeue(){
         return list.pollFirst();
     }
     public int first(){
         return list.peekFirst();
     }
 
 }