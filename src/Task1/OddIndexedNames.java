package Task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIndexedNames {

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "Anna", "John", "Lucy");
        String result = getOddIndexedNames(names);
        System.out.println(result);
    }

    public static String getOddIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> (i) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}