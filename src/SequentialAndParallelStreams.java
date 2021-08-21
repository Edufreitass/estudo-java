package src;

import java.util.Arrays;
import java.util.List;

public class SequentialAndParallelStreams {

    public static void main(String[] args) {
        // Sequential Streams
        List<Integer> listOfNumbersOne = Arrays.asList(1, 2, 3, 4);
        listOfNumbersOne.stream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );

        System.out.println("----------------");

        // Parallel Streams
        List<Integer> listOfNumbersTwo = Arrays.asList(1, 2, 3, 4);
        listOfNumbersTwo.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );
    }

}
