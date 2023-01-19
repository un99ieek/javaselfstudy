public class ch04 {
    // Q1. 조건문의 참과 거짓
    public static void q1() {
        System.out.println("everyware");
    }

    // Q2. 3의 배수의 합
    public static void q2() {
        int result = 0;
        int i = 1;
        while(i <= 1000) {
            if(i % 3 == 0) {
                result += i;
            }
            i++;
        }
        System.out.println(result);
    }

    // Q3. 별 표시하기
    public static void q3() {
        int i = 1;
        while (i < 6) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
            i++;
        }
    }

    // Q4. 1부터 100까지 출력하기
    public static void q4() {
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // Q5. 평균점수 구하기
    public static void q5() {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;
        for (int point: marks) {
            sum += point;
        }
        System.out.println((double)(sum / marks.length));
    }
}
