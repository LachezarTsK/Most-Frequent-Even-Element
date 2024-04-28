
#include <array>
#include <vector>
using namespace std;

class Solution {

    static constexpr array<int, 2> RANGE_OF_VALUES {0, 100000};
    static const int NO_EVEN_VALUE_FOUND = -1;

public:
    int mostFrequentEven(const vector<int>& input) const {
        array<int, RANGE_OF_VALUES[1] + 1>frequency{};
        for (const auto& value : input) {
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
};
