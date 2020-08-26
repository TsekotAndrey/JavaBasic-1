package task1;
import java.util.Scanner;
public class Main {
    //Циклы. Задача №1!
    public static void main(String[] args) {
        int result = sum();
        System.out.println(result);
          }
    public static int sum() {
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
