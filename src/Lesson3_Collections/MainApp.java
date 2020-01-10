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

        Set<String> hashSet = new HashSet<>(Arrays.asList(arr));
        System.out.println("Выводим список уникальных значений из заданного массива: ");
        System.out.println(hashSet);

        // чтобы посчитать количество вхождений через frequency, загоним массив в ArrayList

        List<String> arrList = new ArrayList<>(Arrays.asList(arr));

        Iterator<String> iter = hashSet.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str + " встречается "+ Collections.frequency(arrList, str) +" раз(а)");
        }

        // Задание 2
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Медведев", "(909) 123 45 67");
        phoneBook.add("Царев", "(910) 786 54 32");
        phoneBook.add("Лавров", "(905) 101 12 34");
        phoneBook.add("Лавров", "(905) 202 56 78");
        phoneBook.add("Лавров", "(905) 303 91 01");
        phoneBook.add("Моисеев", "(909) 498 61 23");
        phoneBook.add("Вернадский", "(901) 650 65 45");

        phoneBook.print();

        System.out.println(phoneBook.get("Лавров"));

    }
}
