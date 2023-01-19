public class Calculator {
    // int value;
    Integer value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    Integer getValue() {
        return this.value;
    }

    boolean isOdd(int val) {
        boolean result = false;
        if(val % 2 != 0) {
            result = true;
        }
        return result;
    }

    int avg(int[] data) {
        int sum = 0;
        for(int num: data) {
            sum += num;
        }
        return (int)(sum / data.length);
    }
}
