package stream;

public class Main {

    public static void main(String[] args) {
        /*
        instanceof 연산자는 참조 변수가 참조하고 있는 인스턴스의 실제 타입을 반환해 줍니다.
        즉, 해당 객체가 어떤 클래스나 인터페이스로부터 생성되었는지를 판별해 주는 역할을 합니다.

        instanceof 연산자는 왼쪽 피연산자인 인스턴스가 오른쪽 피연산자인 클래스나 인터페이스로부터 생성되었으면 true 를 반환하고, 그렇지 않으면 false 를 반환합니다.
         */

        A a = new A();
        B b = new B();

        System.out.println(a instanceof A); // true
        System.out.println(b instanceof A); // true
        System.out.println(a instanceof B); // false
        System.out.println(b instanceof B); // true

    }

}
