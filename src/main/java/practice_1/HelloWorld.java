package practice_1;

public class HelloWorld {
    // поля
    static int a = 1;


    // методы
    // зеленая стрелочка программа запускаема
    // метод main - точка входа в программу
    public static void main(String[] args) {
        int sum1 = sum(1001,2000);
        int mult1 = multiplay(3,5);
        System.out.println("Результат сложения: " + sum1);
        System.out.println("Результат умножения: " + mult1);
        int sub = substruct(10,7);
        System.out.println("Результат вычитания: " + sub);
        double div1 = divide(3,2);
        System.out.println("Результат деления: " + div1);
    }


    public static int sum(int x,int y){
            // тело метода
            return x + y; // возвращаемое значение из метода
        }

    public static int multiplay(int p, int k){ // аргументами метода
        // тело метода
        int mult = p * k; // создала переменную, присвоила значение результату
        // умножения  p и k
        return mult;
    }

    public static int substruct(int g, int l){
        return g - l;
    }

    // возвращаемый тип данных целое или нет? 3.
    public static double divide(int s, int h){
        return (double) s/h;
    }
}