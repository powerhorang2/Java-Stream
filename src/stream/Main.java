package stream;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*
        1. anyMatch() : 해당 스트림의 일부 요소가 특정 조건을 만족할 경우에 true 를 반환함.
        2. allMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족할 경우에 true 를 반환함.
        3. noneMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족하지 않을 경우에 true 를 반환함.
        세 메소드 모두 인수로 Predicate 객체를 전달받으며, 요소의 검사 결과는 boolean 값으로 반환합니다.
         */
        IntStream stream1 = IntStream.of(30, 90, 70, 10);
        IntStream stream2 = IntStream.of(30, 90, 70, 10);

        System.out.println(stream1.anyMatch(n -> n > 80));
        System.out.println(stream2.allMatch(n -> n > 80));
    }

}
