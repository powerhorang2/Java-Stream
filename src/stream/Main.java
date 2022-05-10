package stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*
        IntStream 이나 DoubleStream 과 같은 기본 타입 스트림에는
        해당 스트림의 모든 요소에 대해 합과 평균을 구할 수 있는 sum()과 average() 메소드가 각각 정의되어 있습니다.
        이때 average() 메소드는 각 기본 타입으로 래핑 된 Optional 객체를 반환합니다.
         */
        IntStream stream1 = IntStream.of(30, 90, 70, 10);
        DoubleStream stream2 = DoubleStream.of(30.3, 90.9, 70.7, 10.1);

        System.out.println(stream1.sum());
        System.out.println(stream2.average().getAsDouble());
    }

}
