package stream;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        /*
        get() 메소드를 사용하면 Optional 객체에 저장된 값에 접근할 수 있습니다.
        만약 Optional 객체에 저장된 값이 null 이면, NoSuchElementException 예외가 발생합니다.
        따라서 get() 메소드를 호출하기 전에 isPresent() 메소드를 사용하여 Optional 객체에 저장된 값이 null 인지 아닌지를 먼저 확인한 후 호출하는 것이 좋습니다.
         */
        Optional<String> opt = Optional.ofNullable("자바 Optional 객체");

        if(opt.isPresent()) {
            System.out.println(opt.get());
        }

        /*
        또한, 다음과 같은 메소드를 사용하여 null 대신에 대체할 값을 지정할 수도 있습니다.

        1. orElse() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 값을 반환함.
        2. orElseGet() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 람다 표현식의 결괏값을 반환함.
        3. orElseThrow() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 예외를 발생시킴.
         */

        Optional<Object> emptyOpt = Optional.empty(); // Optional 를 null 로 초기화함.

        System.out.println(emptyOpt.orElse("빈 Optional 객체"));
        System.out.println(emptyOpt.orElseGet(String::new));
    }

}
