package algorithms.matchparentheses;

public class MatchParentheses
{
    private static final char OPEN = '(';
    private static final char CLOSE = ')';

    public static void main(String[] args)
    {
        String testString = "(Here is some text (I thought it would be nice to have (some) text here). Thanks for reading (have a nice day))";

        int match = findMatchingParen(testString, 55);

        System.out.println(match);
    }

    private static int findMatchingParen(String testString, int parenIndex)
    {
        char start = testString.charAt(parenIndex);

        if (start == OPEN)
        {
            return getMatchingClose(testString, parenIndex);
        }

        else if (start == CLOSE)
        {
            return getMatchingOpen(testString, parenIndex);
        }

        else
        {
            String message = String.format("Bad parenIndex, does not correspond to an enclosure.  The index returned \"%s\"", start);
            throw new IllegalArgumentException(message);
        }
    }

    private static int getMatchingClose(String testString, int index)
    {
        int parenCount = 1;
        while (index++ < testString.length() && parenCount > 0)
        {
            if (OPEN == testString.charAt(index))
                parenCount++;
            if (CLOSE == testString.charAt(index))
                parenCount--;
        }
        return index;
    }

    private static int getMatchingOpen(String testString, int index)
    {
        int parenCount = 1;
        while (index-- > 0 && parenCount > 0)
        {
            if (OPEN == testString.charAt(index))
                parenCount--;
            if (CLOSE == testString.charAt(index))
                parenCount++;
        }
        return index;
    }

}
