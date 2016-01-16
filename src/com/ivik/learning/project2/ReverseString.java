package com.ivik.learning.project2;

/**
 * Created by Sebastien on 27-12-2015.
 */
public class ReverseString {

    public static void main(String[] args) {

        String sentence = "Please STEP ON NO PETS and do not trip over palindromes.";
        int sentenceLength = sentence.length();
        System.out.println("This is the input sentence:" + "\r\n" + sentence + "\r\n");
        System.out.println("This is the output sentence:");

        for(int i = sentenceLength-1; i >= 0; i--) {
            System.out.print(sentence.charAt(i));
        }
    }
}
