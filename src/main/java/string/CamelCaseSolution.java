package string;


import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Write simple .camelCase method for strings.
 * All words must have their first letter capitalized without spaces.
 * <p>
 * Examples:
 * <p>
 * camelCase("hello case"); // => "HelloCase"
 * camelCase("camel case word"); // => "CamelCaseWord"
 */
public class CamelCaseSolution {


    public static String camelCaseOptimal(String str) {
        return (str == null || str.isEmpty()) ? "" : Arrays.stream(str.trim().split("\\s+"))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1, s.length()))
                .collect(Collectors.joining());
    }

    public static String camelCase(String str) {

        String result;
        if (str == "" || str == null || str.trim() == "") {
            result = "";
        } else {
            char[] charArray = str.trim().toCharArray();
            if (charArray.length > 0) {
                charArray[0] = Character.toUpperCase(charArray[0]);

                for (int i = 1; i < charArray.length - 1; i++) {
                    if (String.valueOf(charArray[i]).equals(" ")) {
                        if (!(String.valueOf(charArray[i + 1])).equals(" ")) {
                            charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
                        }
                    }
                }
            }
            result = String.valueOf(charArray).trim().replaceAll("(\\s)", "");
        }
        return result;
    }

}
