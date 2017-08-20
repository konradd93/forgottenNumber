import java.util.ArrayList;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

public class ForgottenNumber {

    private ArrayList<Integer> sortedListOfNumbers;

    public int findNumber(int[] A) {
        sortedListOfNumbers = arrayToSortedArrayList(A);
        return getForgottenNumber(new ArrayList<>(sortedListOfNumbers.stream().filter(e -> e >= 0).collect(toList())));
    }

    private ArrayList<Integer> arrayToSortedArrayList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>(array.length);
        Arrays.stream(array).sorted().forEach(e -> arrayList.add(e));
        return arrayList;
    }

    private int getForgottenNumber(ArrayList<Integer> sortedListOfNumbersGreaterThanOrEqualToZero) {
        if (sortedListOfNumbersGreaterThanOrEqualToZero.isEmpty()) return 1;
        for (Integer currentElement : sortedListOfNumbersGreaterThanOrEqualToZero) {
            if (nextElementExist(currentElement))
                if (thereIsNoNextInteger(sortedListOfNumbersGreaterThanOrEqualToZero, currentElement))
                    return currentElement + 1;
        }
        return sortedListOfNumbersGreaterThanOrEqualToZero
                .get(sortedListOfNumbersGreaterThanOrEqualToZero.size() - 1) + 1;
    }

    private boolean thereIsNoNextInteger(ArrayList<Integer> sortedListOfNumbersGreaterThanOrEqualToZero, Integer currentElement) {
        return currentElement + 1 != sortedListOfNumbersGreaterThanOrEqualToZero.get(sortedListOfNumbersGreaterThanOrEqualToZero.indexOf(currentElement) + 1);
    }

    private boolean nextElementExist(Integer e) {
        return sortedListOfNumbers.indexOf(e) + 1 < sortedListOfNumbers.size();
    }
}
