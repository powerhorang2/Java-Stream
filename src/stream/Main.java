package stream;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        // 생성자 + 문자열로 초기화 하는 방법
        BigDecimal value1 = new BigDecimal("12.23");
        System.out.println(value1);

        // double 타입으로 초기화하는 방법
        // 내부적으로 생성자 + 문자열을 사용한다.
        BigDecimal value2 = BigDecimal.valueOf(34.45);
        System.out.println(value2);

        // 아래와 같이 사용하면 안 된다.
        // 12.230000000000000426325641456060111522674560546875
        BigDecimal dontDoThis = new BigDecimal(12.23);
        System.out.println(dontDoThis);
    }

}
