package task6;

//Линейный программы. Задача 2
public class main {
    public static void main(String[] args) {
        double a = 5;
        double b = 6;
        double c = 8;
        double result = ((b + Math.sqrt((b * b + 4 * a * c))) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(result);
    }
}
