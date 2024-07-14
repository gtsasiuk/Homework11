package Task4;

import java.util.stream.Stream;

public class LinearCongruentialGenerator {

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);

        Stream<Long> randomNumbers = generateRandomNumbers(a, c, m, 0);


        randomNumbers.limit(20).forEach(System.out::println);
    }

    public static Stream<Long> generateRandomNumbers(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}