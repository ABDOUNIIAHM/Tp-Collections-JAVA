package org.example.tpsets;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Rouge");
        colors.add("Cyan");
        colors.add("Bleu");
        colors.add("Vert");

        Set<String> others = new HashSet<>();
        others.add("Jaune");
        others.add("Magenta");

        System.out.println(colors);
        System.out.println("=============================================");
        System.out.println(others);
        System.out.println("=============================================");

        colors.addAll(others);
        System.out.println(colors);
        System.out.println("=============================================");

        //Iterator<String> it = colors.iterator();  // ConcurrencyModificationException...

        colors.removeAll(others);
        System.out.println(colors);
        System.out.println("=============================================");

        Iterator<String> it = colors.iterator();

        while (it.hasNext()){
            String color = it.next();
            if(color.equalsIgnoreCase("vert")){
                it.remove();
            }
        }
        System.out.println(colors);
        System.out.println("=============================================");
        colors.clear();
        System.out.println(colors);











    }
}
