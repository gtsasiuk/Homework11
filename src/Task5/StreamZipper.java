package Task5;

import java.util.Iterator;
import java.util.stream.Stream;

public class StreamZipper {

    public static void main(String[] args) {
        Stream<String> first = Stream.of("A", "B", "C");
        Stream<String> second = Stream.of("1", "2", "3", "4", "5");

        Stream<String> zippedStream = zip(first, second);
        zippedStream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Stream.Builder<T> resultStream = Stream.builder();

        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            resultStream.add(firstIterator.next());
            resultStream.add(secondIterator.next());
        }

        return resultStream.build();
    }
}
