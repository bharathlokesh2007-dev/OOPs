class Employee {
    String name;
    double basesalary;
    void displayBasicInfo()
    {
        System.out.println("Name:" + name);
        System.out.println("Base Salary:" + basesalary);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    void  writeCode()
    {
        System.out.println("programmingLanguage:" + programmingLanguage);
    }
}
class Tester extends Employee{
     String testingTool;
    void   runTests()
    {
         System.out.println("TestingTool:" + testingTool);
    }
}
public class emp {

    public static void main(String[] args) {
        Developer d = new Developer();
        Tester t = new Tester();
        d.name = "Bharath";
        d.basesalary = 120000;
        d.programmingLanguage = "Java";
        t.testingTool = "JaCoCo";
        d.displayBasicInfo();
        d.writeCode();
        t.runTests();

    }
}
