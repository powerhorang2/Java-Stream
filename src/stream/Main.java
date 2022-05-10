package stream;

public class Main {

    public static void main(String[] args) {

        /*
        묵시적 타입 변환이란 대입 연산이나 산술 연산에서 컴파일러가 자동으로 수행해주는 타입 변환을 가리킵니다.
        자바에서는 데이터의 손실이 발생하지 않거나, 데이터의 손실이 최소화되는 방향으로 묵시적 타입 변환을 진행합니다.
        또한, 자바에서는 데이터의 손실이 발생하는 대입 연산은 허용하지 않습니다.

        다음 예제는 대입 연산과 산술 연산에서 일어나는 묵시적 타입 변환을 보여줍니다.
         */

        double num1 = 10; // int -> double 데이터 손실 최소화
        // int num2 = 3.14; // double -> int 데이터 손실 O, 컴파일 오류 발생
        double num3 = 7.0f + 3.14; // float + double -> double + double 로 타입 변환 후 연산 진행

        System.out.println(num1);
        System.out.println(num3);

        /*
        자바 컴파일러가 자동으로 수행하는 타입 변환은 언제나 데이터의 손실이 최소화되는 방향으로 이루어집니다.

        따라서 자바에서는 타입의 표현 범위에 따라 다음과 같은 방향으로 자동 타입 변환이 이루어집니다.
        byte 형 → short 형 → int 형 → long 형 → float 형 → double 형
                char 형 ↗
         */

        byte num4 = 100;        // OK
        byte num5 = 200;        // Type mismatch
        int num6 = 9876543210;  // Out of range
        long num7 = 9876543210; // Out of range
        float num8 = 3.14;      // Type mismatch

        /*
        위 예제의 첫번째 라인에서는 byte 형 변수에 표현 범위가 더 큰 int 형 데이터를 대입하고 있습니다.
        하지만 정수 100은 byte 형 변수가 표현할 수 있는 범위 내에 있으므로, 자동으로 타입 변환이 이루어져 대입됩니다.

        그러나 두번째 라인처럼 byte 형 변수가 표현할 수 있는 범위를 벗어난 int 형 데이터는 타입 변환되지 못하고, 오류를 발생시킬 것입니다.

        5번째 라인도 마찬가지로 float 형 변수가 표현할 수 있는 범위를 벗어난 double 형 데이터를 대입하므로, 오류를 발생시킵니다.

        3, 4 번째 라인에서는 모두 Out of range 오류가 발생할 것입니다.
        이것은 int 형 리터럴이 표현할 수 있는 최대 범위인 2,147,483,647을 초과하는 정수형 리터럴을 사용했기 때문입니다.
        이렇게 int 형 리터럴보다 더 큰 정수를 사용하기 위해서는 다음 예제처럼 리터럴의 마지막에 L이나 l 접미사를 추가하여 long 형 리터럴로 명시해야만 합니다.
         */

        int num9 = 9876543210L;  // Type mismatch
        long num10 = 9876543210L; // OK

        // 하지만 변수 num9 가 있는 라인에서는 int 형 변수가 표현할 수 있는 범위를 벗어난 long 형 데이터를 대입하므로, 오류를 발생시킬 것입니다.
    }

}
