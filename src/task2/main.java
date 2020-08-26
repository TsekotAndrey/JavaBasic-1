package task2;
//Циклы. 3 задача!
public class main {
    public static void main(String[] args) {
        int result = sum();
        System.out.println("Expected result = 348551" + "; Actual result = " + result );
    }
    public static int sum() {
        int x = 1;
        int sum = 0;
        for (int i = x; i <= x + 100; i++) {
            sum = sum + i * i;
        }
        return sum;

    }
}