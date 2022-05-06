package stream;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // 가변 매개변수에서 스트림 생성
        // Stream 클래스의 of() 메소드를 사용하면 가변 매개변수(variable parameter)를 전달받아 스트림을 생성할 수 있습니다.
        Stream<Double> stream = Stream.of(4.2, 2.5, 3.1, 1.9);
        stream.forEach(System.out::println);
    }

}
