
function mostFrequentEven(input: number[]): number {
    const RANGE_OF_VALUES = [0, Math.pow(10, 5)];
    const NO_EVEN_VALUE_FOUND = -1;
    const frequency: number[] = new Array(RANGE_OF_VALUES[1] + 1).fill(0);
    for (let value of input) {
        ++frequency[value];
    }

    let mostFrequentEvenValue = NO_EVEN_VALUE_FOUND;
    let maxFrequency = 0;
    for (let value = RANGE_OF_VALUES[0]; value <= RANGE_OF_VALUES[1]; value += 2) {
        if (frequency[value] > maxFrequency) {
            mostFrequentEvenValue = value;
            maxFrequency = frequency[value];
        }
    }
    return mostFrequentEvenValue;
};
