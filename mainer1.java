class Rectangle{
    private double length = 5;
    private double width = 15;
    public void getter()
    {
        System.out.println(length);
        System.out.println(width);
    }
    public void setter(double l,double w){
        length = l;
        width = w;
        if(length < 0 || width < 0){
            System.out.println("Invalid");
        }
    }
    public void calculateArea(){
        double area = length*width;
        System.out.println("Area:" +area);
    }
    public void calulatePerimeter(){
        double perimeter = 2*(length+width);
        System.out.println("Perimeter:" +perimeter);
    }
}
public class mainer1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getter();
        r.calculateArea();
        r.calulatePerimeter();
        r.setter(10,20);
        r.getter();
        r.calculateArea();
        r.calulatePerimeter();
    }
}
