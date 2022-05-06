package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // 특정 타입의 난수로 이루어진 스트림 생성
        IntStream stream = new Random().ints(4);
        // IntStream stream = new Random().ints().limit(4);
        stream.forEach(System.out::println);
    }

}
