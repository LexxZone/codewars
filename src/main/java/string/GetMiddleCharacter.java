package string;

/**
 * You are going to be given a word. Need to return the middle character of the word.
 * If the word's length is odd, return the middle character.
 * If the word's length is even, return the middle 2 characters.
 */
class GetMiddleCharacter {
    public static String getMiddle(String word) {

        int length = word.length();

        return (word.length() % 2 == 0) ?
                word.substring((length / 2) - 1, (length / 2) + 1) :
                word.substring((length - 1) / 2, (length - 1) / 2 + 1);
        /**
         *  ******** Alternative solution *************
         *
         *  (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
         *
         */
    }

}