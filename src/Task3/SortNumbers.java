package Task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortNumbers {

    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String result = getSortedNumbers(inputArray);
        System.out.println(result);
    }

    public static String getSortedNumbers(String[] inputArray) {
        return Arrays.stream(inputArray)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}