package Task2;

import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseSorting {

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "Anna", "John", "Lucy");
        List<String> result = getUpperCaseSortedNames(names);
        System.out.println(result);
    }

    public static List<String> getUpperCaseSortedNames(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }
}