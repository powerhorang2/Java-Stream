package stream;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /*
        collect() 메소드는 인수로 전달되는 Collectors 객체에 구현된 방법대로 스트림의 요소를 수집합니다.
        또한, Collectors 클래스에는 미리 정의된 다양한 방법이 클래스 메소드로 정의되어 있습니다.
        이 외에도 사용자가 직접 Collector 인터페이스를 구현하여 자신만의 수집 방법을 정의할 수도 있습니다.

        스트림 요소의 수집 용도별 사용할 수 있는 Collectors 메소드는 다음과 같습니다.

        1. 스트림을 배열이나 컬렉션으로 변환 : toArray(), toCollection(), toList(), toSet(), toMap()
        2. 요소의 통계와 연산 메소드와 같은 동작을 수행 : counting(), maxBy(), minBy(), summingInt(), averagingInt() 등
        3. 요소의 소모와 같은 동작을 수행 : reducing(), joining()
        4. 요소의 그룹화와 분할 : groupingBy(), partitioningBy()
         */

        Stream<String> stream1 = Stream.of("넷", "둘", "하나", "셋");

        List<String> list = stream1.collect(Collectors.toList());
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }

        Stream<String> stream2 = Stream.of("HTML", "CSS", "JAVA", "PHP");

        Map<Boolean, List<String>> patition = stream2.collect(Collectors.partitioningBy(s -> (s.length() % 2) == 0));

        List<String> oddLengthList = patition.get(false);
        System.out.println(oddLengthList);

        List<String> evenLengthList = patition.get(true);
        System.out.println(evenLengthList);
    }

}
