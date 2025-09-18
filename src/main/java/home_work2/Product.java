package home_work2;

public class Product {
    String name;
    int price;

Product(String someName, int somePrice){
    this.name= someName;
    this.price =somePrice;
}
String getName(){
    return this.name;
}
int getPrice(){
    return this.price;
    }
void setPrice(int newPrice){
    this.price=newPrice;
}
int applyDiscount(int discount){
    return this.price = price*(discount/100);
}
//void printInfo(){
//    System.out.println("Товар: " + name + ", цена: " + applyDiscount(int discount));
//}

}
