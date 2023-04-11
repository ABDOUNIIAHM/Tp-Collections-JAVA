package org.example.tpdict;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Main2 {

    public static void main(String[] args) {
        Map<String,String> carnet = new HashMap<>();

        carnet.put("Arthur", "0607070606");
        carnet.put("Thibault", "0605000005");
        carnet.put("Estelle", "0700000700");
        carnet.put("Boris","0650000000");

        System.out.println(carnet.get("Arthur"));

        displayContats(carnet);
        System.out.println("===============================================");
        carnet.put("Boris","0799999907");

        displayContats(carnet);

        Map<Region,String> indicatif = new HashMap<>();
        indicatif.put(Region.France, "+33");
        indicatif.put(Region.Polynesie, "+689");
        indicatif.put(Region.Indonesie, "+62");
        indicatif.put(Region.Suisse, "+41");
        indicatif.put(Region.Martinique, "+596");


        Map<User,String> carnet1 = new HashMap<>();
        User user1 = new User("Arthur", Region.France);
        User user2 = new User("Thibault", Region.Martinique);
        User user3 = new User("Boris", Region.Suisse);
        User user4 = new User("Estelle", Region.Polynesie);
        User user5 = new User("Macron", Region.Indonesie);
        carnet1.put(user1,"0607070606");
        carnet1.put(user2,"0605000005");
        carnet1.put(user3,"0650000000");
        carnet1.put(user4,"0700000700");
        carnet1.put(user5,"0633055606");
        System.out.println(indicatif.get(user1.getRegion()));

        displayContactsPlus(carnet1, indicatif);

    }
    public static void displayContats(Map<String, String> carnet){
        for(String key : carnet.keySet()){
            System.out.println("Nom: "+key+"|| num tel: "+changeTelephoneNumbers(carnet.get(key)));
        }
    }
    public static void displayContactsPlus(Map<User, String> carnet, Map<Region,String> indicatif){
        for(User key : carnet.keySet()){
            System.out.println("Nom: "+key.getName()+"|| num tel: "+(indicatif.get(key.getRegion())+""+changeTelephoneNumbers(carnet.get(key))));
        }
    }
    public static String changeTelephoneNumbers(String number){
        StringBuilder num = new StringBuilder();
        char[] number2 = number.toCharArray();
        for (int i = 0; i < number2.length; i++) {
            if (i==0){
                num.append("("+number2[i]+")");
            }else if(i!=0) {
                num.append(number2[i]);
            }
            else if(i%2 != 0 && i != number2.length - 1){
                num.append(".");
            }
        }
        return new String(num);
    }
    public static String changeTelephoneNumbersPlus(String number){
        StringBuilder num = new StringBuilder();
        char[] number2 = number.toCharArray();
        for (int i = 0; i < number2.length; i++) {
            num.append(number2[i]);
            if(i%2 != 0 && i != number2.length - 1){
                num.append(".");
            }
        }
        return new String(num);
    }




}
