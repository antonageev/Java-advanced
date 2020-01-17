package Lesson3_Collections;

import java.util.*;

public class PhoneBook {
    private HashMap<String, Set<String>> hashMap;

    public PhoneBook() {
        this.hashMap = new HashMap<>();
    }

    public void add(String name, String phone){
            Set<String> entry = hashMap.getOrDefault(name, new HashSet<>());
            entry.add(phone);
            hashMap.put(name, entry);
    }

    public Set<String> get(String name){
        return hashMap.get(name);
    }

}
