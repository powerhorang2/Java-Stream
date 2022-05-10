package stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*
        자바에서는 IntStream 클래스와 같이 기본 타입 스트림을 위한 별도의 Optional 클래스를 제공하고 있습니다.

        1. OptionalInt 클래스
        2. OptionalLong 클래스
        3. OptionalDouble 클래스

        이러한 클래스는 반환 타입이 Optional<T> 타입이 아니라 해당 기본 타입이라는 사실만 제외하면 거의 모든 면에서 비슷합니다.

        또한, Optional 객체에서 get() 메소드를 사용하여 저장된 값에 접근할 수 있는 것처럼 클래스별로 저장된 값에 접근할 수 있는 메소드를 제공하고 있습니다.
         */

        IntStream stream = IntStream.of(4, 2, 1, 3);
        OptionalInt result = stream.findFirst();

        System.out.println(result.getAsInt());
    }

}
