package stream;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("넷", "둘", "셋", "하나");
        stream.forEach(System.out::println);
    }

}
