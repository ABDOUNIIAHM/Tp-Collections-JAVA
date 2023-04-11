package org.example.tplistes;

import java.util.Comparator;

public class ComparetorCountry implements Comparator<Country1> {

    @Override
    public int compare(Country1 o1, Country1 o2) {

        return o1.getName().compareToIgnoreCase(o2.getName());
    }

}
