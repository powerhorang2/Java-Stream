package stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*
        findFirst()와 findAny() 메소드는 해당 스트림에서 첫 번째 요소를 참조하는 Optional 객체를 반환합니다.
        두 메소드 모두 비어 있는 스트림에서는 비어있는 Optional 객체를 반환합니다.
         */
        IntStream stream1 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        IntStream stream2 = IntStream.of(4, 2, 7, 3, 5, 1, 6);

        OptionalInt result1 = stream1.sorted().findFirst();
        System.out.println(result1.getAsInt());

        OptionalInt result2 = stream2.sorted().findAny();
        System.out.println(result2.getAsInt());
        /*
        위의 예제에서 볼 수 있듯이 두 메소드의 결과는 같게 출력됩니다.
        하지만 병렬 스트림인 경우에는 findAny() 메소드를 사용해야만 정확한 연산 결과를 반환할 수 있습니다.
         */
    }

}
