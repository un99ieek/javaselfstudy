import java.util.*;

public class ch03 {
    // Q1. 평균점수 구하기
    public static void q1() {
        int korean = 80;
        int english = 75;
        int math = 55;
        double avg = (korean + english + math) / 3;
        System.out.println(avg);
    }

    // Q2. 홀수 짝수 판별
    public static void q2() {
        int num = 13;
        if(num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    // Q3. 주민등록번호 나누기
    public static void q3() {
        String secNum = "881120-1068234";
        String ymd = secNum.substring(0,6);
        String sid = secNum.substring(7);
        System.out.println(ymd);
        System.out.println(sid);
    }

    // Q4. 주민등록번호 인덱싱
    public static void q4() {
        String pin = "881120-1068234";
        char gender = pin.charAt(7);
        System.out.println(gender);
    }

    // Q5. 문자열 바꾸기
    public static void q5() {
        String a = "a:b:c:d";
        System.out.println(a.replaceAll(":", "#"));
    }

    // Q6. 리스트 역순 정렬하기
    public static void q6() {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);
    }

    // Q7. 리스트를 문자열로 만들기
    public static void q7() {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList);
        System.out.println(result);
    }

    // Q8. 맵에서 값 추출하기
    public static void q8() {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        int result = grade.remove("B");
        System.out.println(result);
        System.out.println(grade);
    }

    // Q9. 중복 숫자 제거하기
    public static void q9() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> temp = new HashSet(numbers);
        ArrayList<Integer> result = new ArrayList<>(temp);
        System.out.println(result);
    }

    // Q10. 매직넘버 제거하기
    public static void q10() {
        getCoffeePrice(CoffeeType.AMERICANO);
    }

    private static void getCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }
}
