package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /*
        map() 메소드는 해당 스트림의 요소들을 주어진 함수에 인수로 전달하여, 그 반환값들로 이루어진 새로운 스트림을 반환합니다.
        만약 해당 스트림의 요소가 배열이라면, flatMap() 메소드를 사용하여 각 배열의 각 요소의 반환값을 하나로 합친 새로운 스트림을 얻을 수 있습니다.
         */

        //다음 예제는 문자열로 이루어진 스트림을 map() 메소드를 이용하여 각 문자열의 길이로 이루어진 스트림으로 변환하는 예제입니다.
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream.map(s -> s.length()).forEach(System.out::println);

        //다음 예제는 여러 문자열이 저장된 배열을 각 문자열에 포함된 단어로 이루어진 스트림으로 변환하는 예제입니다.
        String[] arr = {"I study hard", "You study JAVA", "I am hungry"};

        Stream<String> stream1 = Arrays.stream(arr);
        stream1.flatMap(s -> Stream.of(s.split(" +"))).forEach(System.out::println);
    }

}
