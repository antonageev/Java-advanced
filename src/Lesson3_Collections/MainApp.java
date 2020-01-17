package Lesson3_Collections;

import javax.print.DocFlavor;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        // Задание 1
        String[] arr = new String[]{"First", "Second", "Third", "Fourth",
                    "Basement", "Power", "Attitude", "First",
                    "Basement", "Advanced", "Third", "Alternator",
                    "Idiom", "Traffic", "Architect", "Third", "Third"
        };

        Map<String, Integer> hashMap = new HashMap<>();
        for (String o: arr){
            hashMap.put(o, hashMap.getOrDefault(o,0)+1);
        }

        System.out.println(hashMap);
        // чтобы посчитать количество вхождений через frequency, загоним массив в ArrayList


        // Задание 2
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Медведев", "(909) 123 45 67");
        phoneBook.add("Царев", "(910) 786 54 32");
        phoneBook.add("Лавров", "(905) 101 12 34");
        phoneBook.add("Лавров", "(905) 202 56 78");
        phoneBook.add("Лавров", "(905) 303 91 01");
        phoneBook.add("Моисеев", "(909) 498 61 23");
        phoneBook.add("Вернадский", "(901) 650 65 45");

        System.out.println();

        System.out.println(phoneBook.get("Лавров"));

    }
}
