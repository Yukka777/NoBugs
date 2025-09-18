package practice_1;

import static java.lang.Math.max;

public class MathOperations {

    public static void main(String[] args){
        int add1 = add(1,3);
        System.out.println("сумма двух чисел " +add1);
        int subtract1 = subtract(3,1);
        System.out.println("разница " +subtract1);
        int multiplay1 = multiply(2,2);
        System.out.println("произведение "+ multiplay1);
        double divide1 = divide(6,4);
        System.out.println("результат деления "+ divide1);
        int findMax1 = findMax(1,9);
        System.out.println("Максимум двух чисел " + findMax1);
        int difference1 = difference(1,7);
        System.out.println("Разница между двумя числами " + difference1);
        int squareArea1 = squareArea(5);
        System.out.println("Площадь квадрата " + squareArea1);
        int squarePerimeter1 = squarePerimeter(5);
        System.out.println("Периметр " + squarePerimeter1);
        double convertSecondsToMinutes1 = convertSecondsToMinutes(76);
        System.out.println("количество минут " + convertSecondsToMinutes1);
        double findHypotenuse1 = findHypotenuse(10,2);
        System.out.println("гипотенуза " + findHypotenuse1);
        double circleCircumference1 =circleCircumference(2);
        System.out.println("длина окружности " + circleCircumference1);
        double calculatePercentage1 = calculatePercentage(10,4);
        System.out.println("процент от общего составляет часть " + calculatePercentage1);
        double celsiusToFahrenheit1 = celsiusToFahrenheit(5);
        System.out.println("перевод в Фаренгейты " + celsiusToFahrenheit1);
        double fahrenheitToCelsius1 = fahrenheitToCelsius(3.7);
        System.out.println("перевод в Цельсий " + fahrenheitToCelsius1);
    }
    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x -y;
    }
    public static int multiply(int x, int y){
        return x *y;
    }
    public static double divide(int x, int y){
        return (double) x/y;
    }
    public static int findMax(int a, int b){
        return max(a,b);
    }
    public static int difference(int x, int y){
        return Math.abs(x - y);
    }
    public static int squareArea(int side){
        return side*side;
    }
    public static int squarePerimeter(int side){
        return side * 4;
    }
    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds/60.0;
    }
    public static double findHypotenuse(double a, double b){
        return (double) Math.sqrt(a*a + b*b);
    }
    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }
    public static double calculatePercentage(double total, double part){
        return  (part / total) * 100;
    }
    public static double celsiusToFahrenheit(double c){
        return  c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f){
        return (double) (f-32)*5/9;
    }
}
