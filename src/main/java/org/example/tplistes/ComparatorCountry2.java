package org.example.tplistes;

import java.util.Comparator;

public class ComparatorCountry2 implements Comparator<Country1> {
    @Override
    public int compare(Country1 o1, Country1 o2) {
        return (o1.getName().toCharArray().length) - (o2.getName().toCharArray().length);

    }
}
