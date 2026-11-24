class Animal{
    String name;
    void eat(){
        System.out.println(name + " is eating");
    }
}
class dog extends Animal{
    String breed;
    void bark()
    {
        System.out.println(name + " the " + breed + " is barking");
    }
}
public class Main {
    public static void main(String[] args) {
        dog d = new dog();
        d.name = "Bhairava";
        d.breed = "labrador";
        d.eat();
        d.bark();
    }
}
