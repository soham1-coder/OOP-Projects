package hello;

public class StringCleaner {

    //removes all punctuation from the string
    public String removePunctuation(String input) {
        if (input == null) 
        {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return input.replaceAll("[\\p{Punct}]", "");
    }

    //converts the  string to lowercase
    public String lowerCase(String input) {
        if (input == null)
        {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return input.toLowerCase();
    }

    //removes leading, trailing, and extra spaces between words
    public String removeExtraSpaces(String input) {
        if (input == null)
        {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return input.trim().replaceAll("\\s+", " ");
    }

    //cleans the input string
    public String cleanString(String input) {
        if (input == null) 
        {
            throw new IllegalArgumentException("Input cannot be null");
        }
        
        input = removePunctuation(input);
        input = lowerCase(input);
        input = removeExtraSpaces(input);
        return input;
    }
}

    

