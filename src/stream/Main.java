package stream;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // iterate() 메소드는 시드(seed)로 명시된 값을 람다 표현식에 사용하여 반환된 값을 다시 시드로 사용하는 방식으로 무한 스트림을 생성합니다.
        IntStream stream1 = IntStream.iterate(1, n -> n + 2).limit(50);// 2, 4, 6, 8, 10, 12, ...
        stream1.forEach(System.out::println);

        // 반면에 generate() 메소드는 매개변수가 없는 람다 표현식을 사용하여 반환된 값으로 무한 스트림을 생성합니다.
        IntStream stream2 = IntStream.generate(() -> 1).limit(100);
        stream2.forEach(System.out::println);
    }

}
