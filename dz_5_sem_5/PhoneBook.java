package dz_5_sem_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов.
 */

public class PhoneBook {
    Map<String, List<String>> book = new HashMap<>();
    
    void show(){
        System.out.println(book);
    }

    void add(String name, String namber){
        if (!doesNumberExist(namber)) {
            if (!book.containsKey(name)) {
                book.put(name, new ArrayList<>());
            }
                book.get(name).add(namber);    
        }else{
            System.out.println("Такой номер уже есть!");
        }
    }

    boolean doesNumberExist(String namber){
        for (String key : book.keySet()) {
            if (book.get(key).contains(namber)) {
                return true;
            }
        }
        return false;
    }

    void showNote(String name){
        if (book.containsKey(name)) {
            System.out.println(name + ": " + book.get(name));
        }else{
            System.out.println("Такого имени нет!");
        }
    }

    void findNoteByNumber(String namber){
        for (String key : book.keySet()) {
            if (book.get(key).contains(namber)) {
                showNote(key);
                return;
            }
        }
        System.out.println("Такого номера нет!");
    }

    void removeNote(String name){
        if (book.containsKey(name)) {
            book.remove(name);
        }else{
            System.out.println("Такого имени нет!");
        }
        
    }

    void removeNumber(String namber){
        for (String key : book.keySet()) {
            if (book.get(key).contains(namber)) {
                book.get(key).remove(namber);
                return;
            }
        }
        System.out.println("Такого номера нет!");
    }
}