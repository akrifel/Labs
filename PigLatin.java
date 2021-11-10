/*
* Project:  PigLatin
* Class: PigLatin.java
* Author:    Ariel Khavasov
* Date:     October 31, 2021
* This program converts the text of a FILE into pig latin
*/
import java.util.Scanner;
import java.io.*;
public class PigLatin{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner input = new Scanner(new File("data.txt"));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.print("\"" + line + "\"" + " in pig latin is \"");
            Scanner words = new Scanner(line);
            while (words.hasNext()) 
            {
                String word = words.next();
                String pigLatin = pigLatinWord(word);
                System.out.print(pigLatin + " ");
            }
            System.out.println("\"");
            words.close();
        }
        input.close();
       
    }
    public static String pigLatinWord(String s)
    {
        String pigWord;
        if (isVowel(s.charAt(0))) 
        {
            pigWord = s + "-way";
        } 
        else if (s.startsWith("th") || s.startsWith("Th")) 
        {
            pigWord = s.substring(2) + "-" + s.substring(0,2) + "ay";
        } 
        else 
        {
            pigWord = s.substring(1,s.length()) + "-" + s.charAt(0) + "ay";
        }
        return pigWord;
    }
    
    public static boolean isVowel(char c)
    {
        String vowels = "aeiouAEIOU";
        return (vowels.indexOf(c) >= 0);    // when index of c in vowels is not -1, c is a vowel
    }
}