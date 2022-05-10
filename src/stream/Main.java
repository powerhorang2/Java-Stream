package stream;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        /*
        자바에서는 BigDecimal 클래스에 다양한 소수점 처리 방식을 제공하고 있다.
        몇 가지 예시로 살펴보면 아래와 같다.
         */

        // 소수점 첫 번째까지 표현, 두번째 자리에서 반올림
        // 12.4
        BigDecimal value1 = BigDecimal.valueOf(12.35).setScale(1, RoundingMode.HALF_UP);
        System.out.println("value1 = " + value1);

        // 소수점 이하 모두 제거하고 올림
        // 13
        BigDecimal value2 = BigDecimal.valueOf(12.34).setScale(0, RoundingMode.CEILING);
        System.out.println("value2 = " + value2);

        // 음수인 경우는 특정 자릿수 이하 제거
        // -12.3
        BigDecimal value3 = BigDecimal.valueOf(-12.34).setScale(1, RoundingMode.CEILING);
        System.out.println("value3 = " + value3);

        // 특정 자릿수 이하 버림
        // 12.3
        BigDecimal value4 = new BigDecimal("12.37").setScale(1, RoundingMode.FLOOR);
        System.out.println("value4 = " + value4);
    }

}
