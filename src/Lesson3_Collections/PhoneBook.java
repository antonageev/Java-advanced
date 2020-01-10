package Lesson3_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneBook {
    private List<PhoneEntry> phoneEntryList = new ArrayList<>();

    public void add(String name, String number){
        phoneEntryList.add(new PhoneEntry(name, number));
    }

    public List get(String nameToFind){
        List<String> outputArrayList = new ArrayList<>();
        Iterator<PhoneEntry> iter = phoneEntryList.iterator();
        while (iter.hasNext()){
            PhoneEntry localEntry = iter.next();
            if (localEntry.getName().equals(nameToFind)) {
                outputArrayList.add(localEntry.getNumber());
            }
        }
        return outputArrayList;
    }

    public void print(){
        Iterator<PhoneEntry> iter = phoneEntryList.iterator();
        while (iter.hasNext()){
            PhoneEntry localEntry = iter.next();
            System.out.println("Фамилия: " +localEntry.getName() + "; Номер: " + localEntry.getNumber());
        }
    }
}
