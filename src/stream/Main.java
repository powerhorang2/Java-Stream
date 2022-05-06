package stream;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // 지정된 범위의 연속된 정수에서 스트림 생성
        IntStream stream1 = IntStream.range(1, 4); // range: a ~ b-1
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        IntStream stream2 = IntStream.rangeClosed(1, 4); // rangeClosed: a ~ b
        stream2.forEach(e -> System.out.print(e + " "));
    }

}
