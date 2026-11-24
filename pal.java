import java.util.Scanner;
public class pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int original = a;
        int rev =0;
        while(a > 0)
        {
            int digit = a%10;
            rev = rev * 10 + digit;
            a = a / 10;

        }
        if(rev == original)
        {
            System.out.println("Palindrome");

        }
        else
        {
            System.out.println("Not a Palindrome");
        }

    }
}
