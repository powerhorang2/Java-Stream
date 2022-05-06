package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        // 컬렉션에서 스트림 생성
        Stream<Integer> stream = list.stream();
        // forEach() 메소드를 이용한 스트림 요소의 순차 접근
        stream.forEach(System.out::println);
        /*
            forEach:

            Stream 클래스의 forEach() 메소드는 해당 스트림의 요소를 하나씩 소모해가며 순차적으로 요소에 접근하는 메소드입니다.
            따라서 같은 스트림으로는 forEach() 메소드를 한 번밖에 호출할 수 없습니다.
            단, 원본 데이터의 요소를 소모하는 것은 아니므로, 같은 데이터에서 또 다른 스트림을 생성하여 forEach() 메소드를 호출하는 것은 가능합니다.
         */
    }


}
