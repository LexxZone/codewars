package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PigLatin {
    //TODO Need to finish this class. It's not working properly yet
    public static String pigIt(String str) {
        StringBuilder result = new StringBuilder();
        List<String> strArray = new ArrayList<>(Arrays.asList(str.trim().split(" ")));
        for (String single: strArray
             ) {
            if(single.length()>1) {
                char a = single.charAt(0);
                single = single.substring(1, single.length()) + String.valueOf(a) + "ay";

            } else {
                single = single + "ay";
            }
            result.append(single).append(" ");

        }
        return result.toString().trim();
    }
}