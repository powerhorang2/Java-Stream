package stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");

        /*
        스트림의 최종 연산은 모두 스트림의 각 요소를 소모하여 연산을 수행하게 됩니다.
        하지만 reduce() 메소드는 첫 번째와 두 번째 요소를 가지고 연산을 수행한 뒤, 그 결과와 세 번째 요소를 가지고 또다시 연산을 수행합니다.
        이런 식으로 해당 스트림의 모든 요소를 소모하여 연산을 수행하고, 그 결과를 반환하게 됩니다.
         */
        Optional<String> result1 = stream1.reduce((s1, s2) -> s1 + "++" + s2);
        result1.ifPresent(System.out::println);

        /*
        또한, 인수로 초깃값을 전달하면 초깃값과 해당 스트림의 첫 번째 요소와 연산을 시작하며, 그 결과와 두 번째 요소를 가지고 계속해서 연산을 수행하게 됩니다.
        인수로 초깃값을 전달하는 reduce() 메소드의 반환 타입은 Optional<T>가 아닌 T 타입입니다.
        그 이유는 비어 있는 스트림과 reduce 연산을 할 경우 전달받은 초깃값을 그대로 반환해야 하기 때문입니다.
         */
        String result2 = stream2.reduce("시작", (s1, s2) -> s1 + "++" + s2);
        System.out.println(result2);
    }

}
