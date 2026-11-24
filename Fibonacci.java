import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fib = 0;
        int fact = 1;
        for(int i = 1;i <= a;i++)
        {
            fib = fib + i;
            fact = fact*i;
        }
        System.out.println(fact);
        System.out.println(fib);
    }
}
