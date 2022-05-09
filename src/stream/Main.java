package stream;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*
         limit() 메소드는 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림을 반환합니다.
         skip() 메소드는 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 새로운 스트림을 반환합니다.
        */
        IntStream stream1 = IntStream.range(0, 10);
        IntStream stream2 = IntStream.range(0, 10);
        IntStream stream3 = IntStream.range(0, 10);

        stream1.skip(4).forEach(n -> System.out.print(n + " "));
        System.out.println();

        stream2.limit(5).forEach(n -> System.out.print(n + " "));
        System.out.println();

        stream3.skip(3).limit(5).forEach(n -> System.out.print(n + " "));
    }

}
