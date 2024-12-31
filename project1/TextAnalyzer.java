package hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class TextAnalyzer extends StringAnalyzer 
{

    public TextAnalyzer(String input) 
    {
        super(input); //obtains input from superclass (stringAnalyzer)
    }

    //calculates the average length of words in the given text
    public double calculateAverageWordLength() 
    {
        if (cleanedString.isEmpty())
        {
            throw new ArithmeticException("String is empty. Cannot calculate average word length.");
        }
        
        //splits the words in the string
        String[] words = cleanedString.split(" ");
        int totalLength = 0;
        
        //gets length of each word
        for (String word : words) {
            totalLength += word.length();
        }

        return (double) totalLength / words.length; 
    }

    //finds the letter that occurs most in the text (ignores spaces)
    public char findMostFrequentLetter() 
    {
        if (cleanedString.isEmpty()) 
        {
            throw new ArithmeticException("String is empty. Cannot find the most frequent letter.");
        }
        
        //stores frequency of each letter
        Map<Character, Integer> letterFrequency = new HashMap<>();
        char mostFrequent = ' ';
        int highestCount = 0;

        //count the occurance of each letter 
        for (char c : cleanedString.toCharArray())
        {
            if (c != ' ') //ignore spaces
            { 
                letterFrequency.put(c, letterFrequency.getOrDefault(c, 0) + 1);
                
                //update most frequent letter if current count is higher
                if (letterFrequency.get(c) > highestCount)
                {
                    mostFrequent = c;
                    highestCount = letterFrequency.get(c);
                }
            }
        }
        
        return mostFrequent;
    }

    //returns a list of unique words in alphabetical order
    public List<String> getWordsInAlphabeticalOrder() 
    {
        String[] words = cleanedString.split(" ");
        TreeSet<String> uniqueWords = new TreeSet<>();
        
        for (String word : words) 
        {
            uniqueWords.add(word); 
        }
        
        return new ArrayList<>(uniqueWords); //converts TreeSet to ArrayList
    }
}
