package home_work3;

public class MathConstants {
    final double PI = 3.14159;
    final double E = 2.71828;
    double r;
    public MathConstants(double someR){
        r = someR;}
    void  calculateCircleArea(){
        System.out.println(PI*r*r);
    }
    void  calculateCircumference(){
        System.out.println(2*PI*r);
    }
}
