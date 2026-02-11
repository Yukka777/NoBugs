package home_work3;

public class MathConstants {
    private final double PI = 3.14159;
    private final double E = 2.71828;
    private double r;
    public MathConstants(double someR){
        r = someR;}
    void  calculateCircleArea(){
        System.out.println(PI*r*r);
    }
    void  calculateCircumference(){
        System.out.println(2*PI*r);
    }
}
