package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /*
          sorted() 메소드는 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬합니다.
          이때 비교자를 전달하지 않으면 기본적으로 사전 편찬 순(natural order)으로 정렬하게 됩니다.
         */
        Stream<String> stream1 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");

        stream1.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();

        stream2.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
    }

}
