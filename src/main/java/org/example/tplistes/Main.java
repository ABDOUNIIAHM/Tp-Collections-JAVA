package org.example.tplistes;

import org.example.tplistes.ComparatorCountry2;
import org.example.tplistes.ComparetorCountry;
import org.example.tplistes.Country;
import org.example.tplistes.Country1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ComparetorCountry comparator = new ComparetorCountry();
        ComparatorCountry2 comparator2 = new ComparatorCountry2();
        //Country country = new Country();

        Country1 country1 = new Country1("Morroco");
        Country1 country2 = new Country1("France");
        Country1 country3 = new Country1("Belgique");
        Country1 country4 = new Country1("Balad");
        Country1 country5 = new Country1("gambia");

        List<Country1> countriess = new ArrayList<>();
        countriess.add(country1);
        countriess.add(country2);
        countriess.add(country3);
        countriess.add(country4);
        countriess.add(country5);

        //Collections.sort(countries);
        Collections.sort(countriess, comparator);
        for (Country1 countryy:countriess) {
            System.out.println(countryy.getName());
        }
        System.out.println("======================================================");
        Collections.sort(countriess,comparator2);
        for (Country1 countryy:countriess) {
            System.out.println(countryy.getName());
        }

        System.out.println("======================================================");
        Iterator<Country1> it = countriess.iterator();
        while (it.hasNext()){
            Country1 country = it.next();
            if(country.getName().toCharArray().length >6){
                it.remove();
            }
        }
        for (Country1 countryy:countriess) {
            System.out.println(countryy.getName());
        }

    }
}