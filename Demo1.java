class shape{
    String color = "Red";
    void displayColor()
    {
        System.out.println(color);
    }
}
class Circle extends shape{
    double radius = 23.09;
    void CalculateArea(){
        double area = 3.14*radius*radius;
        System.out.println(area);
        displayColor();
    }
}
class Rectangle extends shape{
    int length = 20;
    int breadth = 40;

    void CalculateArea(){
        int area = length*breadth;
        System.out.println(area);
        displayColor();
    }
}
public class Demo1  
{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.CalculateArea();
        Rectangle r = new Rectangle();
        r.CalculateArea();
    }
}
