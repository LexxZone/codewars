package string;

public class SpinWords {
    /**
     * Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
     * <p>
     * Examples:
     * <p>
     * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
     * spinWords( "This is a test") => returns "This is a test"
     * spinWords( "This is another test" )=> returns "This is rehtona test"
     */


    public String spinWords(String phrase) {
        StringBuilder result = new StringBuilder();
        String[] list = phrase.split("\\s*(\\s|,|!|\\.)\\s*");
        for (String single : list) {
            if (single.length() > 4) {
                StringBuffer sb = new StringBuffer(single);
                single = sb.reverse().toString();
            }
            result.append(single).append(" ");
        }
        return result.toString().trim();
    }
}


/*    ANOTHER SOLUTIONS:

import java.util.stream.*;
import java.util.Arrays;

public class SpinWords {

  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
                 .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                 .collect(Collectors.joining(" "));
  }
}

 -----------------------------------------

 import java.util.Arrays;

public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i<words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ",words);
  }
}



 */