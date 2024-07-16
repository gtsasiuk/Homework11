package Task5;

import java.util.stream.Stream;
import java.util.stream.IntStream;

public class StreamZipper {

    public static void main(String[] args) {
        Stream<String> first = Stream.of("A", "B", "C");
        Stream<String> second = Stream.of("1", "2", "3", "4", "5");

        Stream<String> zippedStream = zip(first, second);
        zippedStream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        T[] firstArray = (T[]) first.toArray();
        T[] secondArray = (T[]) second.toArray();
        int minLength = Math.min(firstArray.length, secondArray.length);

        return IntStream.range(0, minLength)
                .mapToObj(i -> Stream.of(firstArray[i], secondArray[i]))
                .flatMap(s -> s);
    }
}
