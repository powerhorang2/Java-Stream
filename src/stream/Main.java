package stream;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //빈 스트림 생성
        Stream<Object> stream = Stream.empty();
        System.out.println(stream.count()); //스트림 요소의 총 개수를 출력함
    }

}
