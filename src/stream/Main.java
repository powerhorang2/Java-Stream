package stream;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*
        count() 메소드는 해당 스트림의 요소의 총 개수를 long 타입의 값으로 반환합니다.
        또한, max()와 min() 메소드를 사용하면 해당 스트림의 요소 중에서 가장 큰 값과 가장 작은 값을 가지는 요소를 참조하는 Optional 객체를 얻을 수 있습니다.
         */
        IntStream stream1 = IntStream.of(30, 90, 70, 10);
        IntStream stream2 = IntStream.of(30, 90, 70, 10);

        System.out.println(stream1.count());
        System.out.println(stream2.max().getAsInt());
    }

}
