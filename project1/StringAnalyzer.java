package hello;

import java.util.HashMap;
import java.util.Map;

public class StringAnalyzer
{

    public String cleanedString;

    public StringAnalyzer(String input)
    {
        if (input == null || input.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        
        //creates new instance of StringCleaner object
        StringCleaner cleaner = new StringCleaner();
        this.cleanedString = cleaner.cleanString(input);
    }

    //calculates the frequency of each word in the cleaned string
    public Map<String, Integer> getWordFrequencies() 
    {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = cleanedString.split(" ");

        //iterates through each word in the word array
        for (String word : words)
        {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1); //Uses frequencyMap to update frequency count
        }
        return frequencyMap;
    }


    //finds the longest word in the cleaned string
    public String getLongestWord() 
    {
        if (cleanedString.isEmpty()) 
        {
            throw new ArithmeticException("String is empty. Cannot find the longest word.");
        }

        String[] words = cleanedString.split(" ");
        String longestWord = "";

        //iterates through words
        for (String word : words) 
        {
            //if current word is longer than longest word
            if (word.length() > longestWord.length()) 
            {
                longestWord = word; //sets longest word to current word
            }
        }
        return longestWord;
    }

    
    //checks if the cleaned string is a palindrome.
    public boolean isPalindrome() 
    {
        if (cleanedString.isEmpty()) 
        {
            throw new ArithmeticException("String is empty. Cannot check for palindrome.");
        }

        String reversedString = new StringBuilder(cleanedString.replaceAll(" ", "")).reverse().toString();
        return cleanedString.replaceAll(" ", "").equalsIgnoreCase(reversedString);
    }
}


    

