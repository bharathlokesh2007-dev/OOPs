class Person{
    String Name = "Bharath";
    void displayPerson()
    {
        System.out.println(Name);
    }
}
class Employee extends Person{
    int employeeId = 23;
    void DisplayEmployee(){
        System.out.println(employeeId);
    }
}
class Manager extends Employee{
    String Department = "Developer";

    void DisplayManager(){
        System.out.println(Department);
    }
}
public class Demo2
{
    public static void main(String[] args) {
     Manager c = new Manager();
        c.DisplayManager();
        c.DisplayEmployee();
        c.displayPerson();
    }
}

