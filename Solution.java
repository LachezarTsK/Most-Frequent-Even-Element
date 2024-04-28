
public class Solution {

    private static final int[] RANGE_OF_VALUES = {0, (int) Math.pow(10, 5)};
    private static final int NO_EVEN_VALUE_FOUND = -1;

    public int mostFrequentEven(int[] input) {
        int[] frequency = new int[RANGE_OF_VALUES[1] + 1];
        for (int value : input) {
            ++frequency[value];
        }

        int mostFrequentEvenValue = NO_EVEN_VALUE_FOUND;
        int maxFrequency = 0;
        for (int value = RANGE_OF_VALUES[0]; value <= RANGE_OF_VALUES[1]; value += 2) {
            if (frequency[value] > maxFrequency) {
                mostFrequentEvenValue = value;
                maxFrequency = frequency[value];
            }
        }
        return mostFrequentEvenValue;
    }
}
