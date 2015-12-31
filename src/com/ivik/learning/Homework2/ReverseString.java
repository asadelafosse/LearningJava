package com.ivik.learning.Homework2;

/**
 * Created by Sebastien on 27-12-2015.
 */
public class ReverseString {

    public static void main(String[] args) {

        String Sentence = "Please STEP ON NO PETS and do not trip over palindromes.";
        int sentenceLength = Sentence.length();
        System.out.println("This is the input sentence:" + "\r\n" + Sentence + "\r\n");
        System.out.println("This is the output sentence:");

        for(int i = sentenceLength-1; i >= 0; i--) {
            System.out.print(Sentence.charAt(i));
        }
    }
}
