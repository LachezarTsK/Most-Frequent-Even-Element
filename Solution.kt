
import kotlin.math.pow

class Solution {

    companion object {
        val RANGE_OF_VALUES = intArrayOf(0, (10.0).pow(5).toInt())
        const val NO_EVEN_VALUE_FOUND = -1
    }

    fun mostFrequentEven(input: IntArray): Int {
        val frequency = IntArray(RANGE_OF_VALUES[1] + 1)
        for (value in input) {
            ++frequency[value]
        }

        var mostFrequentEvenValue = NO_EVEN_VALUE_FOUND;
        var maxFrequency = 0
        for (value in RANGE_OF_VALUES[0]..RANGE_OF_VALUES[1] step 2) {
            if (frequency[value] > maxFrequency) {
                mostFrequentEvenValue = value
                maxFrequency = frequency[value]
            }
        }
        return mostFrequentEvenValue
    }
}
