package Corejava;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int vcount = 0, ccount = 0; // Initialize vcount, ccount
        StringTokenizer token = new StringTokenizer(str, " ");
        int wcount = token.countTokens();

        for (int i = 0; i < str.length(); i++) {
            // Getting the current character
            char ch = str.charAt(i);
            // Checking if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vcount++;
            } else if (Character.isLetter(ch)) { // Checking if it's a consonant
                ccount++;
            }
        }
        System.out.println("Number of vowels: " + vcount);
        System.out.println("Number of consonants: " + ccount);
        System.out.println("Number of words: " + wcount);
    }
}
