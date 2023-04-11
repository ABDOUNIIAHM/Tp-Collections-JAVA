package org.example.tplistes;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private List<String> countries = new ArrayList<>();

    public void addCountry(String name){
        this.countries.add(name);
    }
    public void displayAll(){
        System.out.println("la collection crée contient "+this.countries.size()+" pays");
        for (String country : this.countries) {
            System.out.println(country);
        }
    }
    public void emptyList(){
        countries.clear();
        System.out.println(countries.isEmpty());
        if(countries.isEmpty() == true){
            System.out.println("Liste vide");
        }
    }
    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getCountries() {
        return countries;
    }
    public void modifyElement(int index, String name){
        this.countries.set(index, name);
    }
}
