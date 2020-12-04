package algorithms;

public class LongestNonRepeatString
{
    public static void main(String[] args)
    {
        String testInput = "sskdjfrngesdfhbikjcgnd";

        String output = findLongestSubString(testInput);

        System.out.println(output);
    }


    private static String findLongestSubString(String input)
    {
        String maxChars = "", charsFound;

        for (int start = 0; start < (input.length() - maxChars.length()); start++)
        {
            charsFound = "";

            for (String currentChar : input.substring(start).split(""))
            {
                // If we find a duplicate, jump the start index
                // to the character after the first instance of the duplicate, for efficiency
                // e.g. Given "ABCDEB", when it finds the second B, it will set start to the C
                if (charsFound.contains(currentChar))
                {
                    start = input.indexOf(currentChar, start);
                    break;
                }

                charsFound += currentChar;
            }

            if (charsFound.length() > maxChars.length())
                maxChars = charsFound;

        }
        return maxChars;
    }
}