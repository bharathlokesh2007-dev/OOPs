import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(a % 2 == 0)
    {
        System.out.println("Even");
    } 
    else{
        System.out.println("odd");
    }
    if(b % 4 == 0)
    {
        System.out.println("Leap Year");
    }
    else{
        System.out.println("Not a leap year");
    }
}
}
