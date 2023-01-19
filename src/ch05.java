public class ch05 {
    // Q1. UpgradeCalculator
    public static void q1() {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());
    }

    // Q2. MaxLimitCalculator
    public static void q2() {
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);
        cal.add(60);
        System.out.println(cal.getValue());
    }

    // Q3. 홀수 짝수 판별하기
    public static void q3() {
        Calculator cal = new Calculator();
        System.out.println(cal.isOdd(3));
        System.out.println(cal.isOdd(4));
    }

    // Q4. 평균값을 구하는 메서드
    public static void q4() {
        int[] data = {1, 3, 5, 7, 9};
        Calculator cal = new Calculator();
        int result = cal.avg(data);
        System.out.println(result);
    }

    // Q5. 리스트와 객체
    public static void q5() {
        System.out.println("결과는 4 : List b가 a를 포인터로 참조하기 때문");
    }

    // Q6. 생성자와 초깃값
    public static void q6() {
        Calculator cal = new Calculator();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다. => value 초기화 생성자 정의
        System.out.println(cal.getValue());
    }

    // Q7. 인터페이스 사용하기
    public static void q7() {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }

    // Q8. 오류 찾기 1
    public static void q8() {
        System.out.println("4번 : Dog 클래스는 Animal 클래스의 자식으로 부모클래스를 생성자로 받을 수 없다.");
    }

    // Q9. 오류 찾기 2
    public static void q9() {
        System.out.println("2번 : Animal 클래스로만 생성했기 때문에 bark() 메소드가 존재하지 않음");
        System.out.println("5번 : Predator 타입의 클래스는 hello() 메소드를 사용할 수 없다.");
    }
}
