
using System;

public class Solution
{
    private static readonly int[] RANGE_OF_VALUES = { 0, (int)Math.Pow(10, 5) };
    private static readonly int NO_EVEN_VALUE_FOUND = -1;

    public int MostFrequentEven(int[] input)
    {
        int[] frequency = new int[RANGE_OF_VALUES[1] + 1];
        foreach (int value in input)
        {
            ++frequency[value];
        }

        int mostFrequentEvenValue = NO_EVEN_VALUE_FOUND;
        int maxFrequency = 0;
        for (int value = RANGE_OF_VALUES[0]; value <= RANGE_OF_VALUES[1]; value += 2)
        {
            if (frequency[value] > maxFrequency)
            {
                mostFrequentEvenValue = value;
                maxFrequency = frequency[value];
            }
        }
        return mostFrequentEvenValue;
    }
}
