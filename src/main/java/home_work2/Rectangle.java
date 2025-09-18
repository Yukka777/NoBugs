package home_work2;

public class Rectangle {
    int width;
    int height;

    Rectangle (int someWidth, int someHight){
        this.width=someWidth;
        this.height=someHight;
    }

    int getWidth(){
        return this.width;
    }
    int getHight(){
        return this.height;
    }

    void setWidth(int newWidth){
        this.width=newWidth;
    }
//    void print(){
//        System.out.println("Площадь равна: " + calculateArea1);
 //   }
}

