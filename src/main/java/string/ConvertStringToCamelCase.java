package string;


public class ConvertStringToCamelCase {

    static String toCamelCase(String s) {

        /**
         *
         * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
         * The first word within the output should be capitalized only if the original word was capitalized.
         *
         * Examples:
         *
         * toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
         *
         * toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
         */
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if(String.valueOf(charArray[i]).equals("-") || String.valueOf(charArray[i]).equals("_")) {
                charArray[i+1] = Character.toUpperCase(charArray[i+1]);
            }
        }
        return String.valueOf(charArray).trim().replaceAll("(-|_)", "");
    }

    public static void main(String[] args) {

        System.out.println(ConvertStringToCamelCase.toCamelCase("the_Stealth_Warrior"));
        String a = ConvertStringToCamelCase.toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields");
        System.out.println(a);
    }


}
