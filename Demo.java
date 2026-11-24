class Vehicle{
    String brand = "BMW";
    void honk()
    {
        System.out.println("Beep!Beep!");
    }
}
class Car extends Vehicle{
    String ModelName = "M6";
    void displayDetails(){
        System.out.println(brand);
        System.out.println(ModelName);
        honk();
    }
}
public class Demo {
    public static void main(String[] args) {
        Car ch = new Car();
        ch.displayDetails();
    }
}
