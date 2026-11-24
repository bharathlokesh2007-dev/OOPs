import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("A:");
     int a = sc.nextInt();
     System.out.println("b:");
     int b = sc.nextInt();
    b = a*b;
    a = b/a;
    b = b/a;
    System.out.println("A:" +a);
    System.out.println("b:" +b);
    }
}
