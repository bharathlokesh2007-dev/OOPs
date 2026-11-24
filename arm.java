import java.util.Scanner;
public class arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int original = a;
        int sum = 0;
        while(a > 0)
        {
            int digit =a%10;
            sum = sum+(digit*digit*digit);
            a = a/10;
        }
        if(original == sum)
        {
            System.out.println("ArmStrong");
        }
        else
        {
            System.out.println("Not an ArmStrong");
        }
    }
}
