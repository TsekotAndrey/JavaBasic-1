package task5;

//Линейный программы. Задача 3
public class main {
    public static void main(String[] args) {
        double x = 352;
        double y = 354;
        double sinX = Math.sin(Math.toRadians(x));
        double cosX = Math.cos(Math.toRadians(x));
        double sinY = Math.sin(Math.toRadians(y));
        double cosY = Math.cos(Math.toRadians(y));
        double tgXY = Math.tan(Math.toRadians(x*y));
        double result = ((sinX+cosY)/(cosX-sinY))*tgXY;
        System.out.println(result);
    }
    }
