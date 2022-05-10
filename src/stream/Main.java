package stream;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        /*
        of() 메소드나 ofNullable() 메소드를 사용하여 Optional 객체를 생성할 수 있습니다.

        of() 메소드는 null 이 아닌 명시된 값을 가지는 Optional 객체를 반환합니다.
        만약 of() 메소드를 통해 생성된 Optional 객체에 null 이 저장되면 NullPointerException 예외가 발생합니다.

        따라서 만약 참조 변수의 값이 만에 하나 null 이 될 가능성이 있다면, ofNullable() 메소드를 사용하여 Optional 객체를 생성하는 것이 좋습니다.
        ofNullable() 메소드는 명시된 값이 null 이 아니면 명시된 값을 가지는 Optional 객체를 반환하며, 명시된 값이 null 이면 비어있는 Optional 객체를 반환합니다.
         */
        Optional<String> opt = Optional.ofNullable("자바 Optional 객체");
        System.out.println(opt.get());
    }

}
