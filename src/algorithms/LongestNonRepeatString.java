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
                if (charsFound.contains(currentChar))
                    break;

                charsFound += currentChar;
            }

            if (charsFound.length() > maxChars.length())
                maxChars = charsFound;

        }


        return maxChars;
    }
}