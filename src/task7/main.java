package task7;
//Линейный программы. Задача 5
public class main {
    public static void main(String[] args) {
        int T = 125;
        int HH = T/3600; //
        int MM = (T%3600)/60; //
        int SS =T- ((HH * 3600) + (MM*60));
        System.out.println("Hours = " + HH + "; Minutes = " + MM + "; Seconds = " + SS +";");
    }
}
