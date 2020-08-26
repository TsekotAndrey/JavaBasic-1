package task3;
//Ветвления. Задача №1
public class main {
    public static void main(String[] args) {
        int a = 45;
        int b = 145;
        int sum = a + b;
        if (1 < sum && sum < 180) {
            System.out.println("Triangle");
        } else {
            System.out.println("Problem");
        }
        int c = 180 - sum;
        if ((a == 90 || b == 90 || c == 90) && (1 < sum && sum < 180)) {
            System.out.println("Right triangle");
        }}}

