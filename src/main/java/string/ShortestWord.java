package string;

import java.util.Arrays;

public class ShortestWord {

    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }

}