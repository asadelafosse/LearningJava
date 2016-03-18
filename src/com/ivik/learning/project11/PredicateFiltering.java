package com.ivik.learning.project11;

import java.util.ArrayList;

/**
 * Created by Sebastien on 18-3-2016.
 */
public class PredicateFiltering {



    public static void main(String[] args) {

        Predicate<String> hasSecondLetterE = new Predicate<String>() {
            @Override
            public boolean evaluate(String s) {
                if (s.charAt(1) == 'e'){
                    return true;
                } else {
                    return false;
                }
            }
        };

        String[] randomWords = {
                "randstedeling",
                "mytochrondriën",
                "neogotiek",
                "fenomenologie",
                "hondsdolheid",
                "eenheidsgevoel",
                "dromedaris",
                "ietsisme",
                "knolselderij",
                "evident"};

        System.out.println("The original words:");
        for(String s: randomWords){
            System.out.println(s);
        }
        System.out.println();

        ArrayList<String> filteredWords = new ArrayList<>();
        for(int i = 0; i < randomWords.length; i++){
            if (hasSecondLetterE.evaluate(randomWords[i])){
                filteredWords.add(randomWords[i]);
            }
        }

        System.out.println("The words that have 'e' as their second letter:");
        for(String s: filteredWords){
            System.out.println(s);
        }
        System.out.println();


    }

}
