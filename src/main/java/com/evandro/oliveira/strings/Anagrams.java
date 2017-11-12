package com.evandro.oliveira.strings;

import java.util.Arrays;

public class Anagrams {

    private static final int NUM_OF_CHARS = 256;

    public boolean areAnagrams(String str1, String str2) {

        //Converts each string into char array
        char[] str1AsCharArray = str1.toCharArray();
        char[] str2AsCharArray = str2.toCharArray();

        //if strings are different in length it means they can't be anagrams
        if (str1AsCharArray.length != str2AsCharArray.length) {
            return false;
        }

        //Creates two count arrays and initialize all values with 0
        int[] count1 = new int[NUM_OF_CHARS];
        int[] count2 = new int[NUM_OF_CHARS];

        Arrays.fill(count1, 0);
        Arrays.fill(count2, 0);

        // Increments the number of characters at corresponding index in the ASCII table
        for (int i = 0; i < str1AsCharArray.length && i < str2AsCharArray.length; i++) {
            count1[str1AsCharArray[i]]++;
            count2[str2AsCharArray[i]]++;
        }

        for (int i = 0; i < NUM_OF_CHARS; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;

    }

}
