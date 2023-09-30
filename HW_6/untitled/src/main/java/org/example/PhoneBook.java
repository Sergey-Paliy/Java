package org.example;

import java.util.*;

public class PhoneBook {
    private static HashMap<String, HashSet<String>> contacts = new HashMap<>();


    private static void addContacts(String name, String phone) {
        if (contacts.containsKey(name)) {
             contacts.get(name).add(phone);

        } else {
            HashSet<String> nambers = new HashSet<>();
            nambers.add(phone);
            contacts.put(name, nambers);
        }
    }

    public static void PrintPhonebook() {
        List<Map.Entry<String, HashSet<String>>> sortedEntries = new ArrayList<>(contacts.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());
        for (Map.Entry<String, HashSet<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



    }
    


    public static void main (String[]args){
        addContacts("Ivanov", "9-10-40");
        addContacts("Ivanov", "9-10-40");
        addContacts("Ivanov", "9-10-41");
        addContacts("Petrov", "9-10-40");
        addContacts("Petrov", "9-10-40");
        addContacts("Petrov", "9-10-40");
        addContacts("Sidorov", "9-10-55");
        addContacts("Sidorov", "9-10-401");
        addContacts("Sidorov", "9-10-40");
        addContacts("Sidorov", "9-10-40");

        PrintPhonebook();
    }
}






