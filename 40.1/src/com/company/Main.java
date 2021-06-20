package com.company;

import java.util.*;
public class Main {
    public static void main(String args[]) {

        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vitaliy");
        set.add("Ravi");
        set.add("Emir");
       
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("*--------------------------------------*");

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Бета");
        linkedHashSet.add("Aльфa");
        linkedHashSet.add("Гaммa");
        linkedHashSet.add("Гaммa");
        linkedHashSet.add("Эпсилон");
        linkedHashSet.add("Oмeгa");

        System.out.println(linkedHashSet);
    }
}

