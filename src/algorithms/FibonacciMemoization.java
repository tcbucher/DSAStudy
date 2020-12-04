package algorithms;

import java.util.HashMap;

public class FibonacciMemoization {

    public static void main(String[] args) {

        HashMap<Integer, Integer> sequence = new HashMap<>();

        sequence.put(0,0);
        sequence.put(1,1);
        sequence.put(2,2);

        int n = 10;

        for (int i = 3; i < n; i++)
        {
            Integer oneAgo = sequence.get(i-1);
            Integer twoAgo = sequence.get(i-2);
            sequence.put(i, oneAgo + twoAgo);
        }

        for (int j = 0; j < sequence.size(); j++)
        {
            String output = String.format("%s: %s",j, sequence.get(j));
            System.out.println(output);
        }
    }
}
