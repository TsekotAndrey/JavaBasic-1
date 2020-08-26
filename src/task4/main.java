package task4;

//Циклы. 4 задача!
public class main {
    public static void main(String[] args) {
        double result = sum(3);
        System.out.println("Result = " + result);
    }
    public static double sum(int x) {
        double sum = 1;
        double tempRes = 0;
        for (int i = x; i < x + 3; i++) {
            tempRes = Math.pow(i, 2);
            sum = tempRes * sum;
        }
        return sum;
    }
}