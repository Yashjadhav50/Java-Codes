import java.util.Scanner;
public class GCD{
    public static int findGCD(int a,int b){
        
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two positive numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int gcd = findGCD(x , y);
        System.out.print("GCD of " + x + " and " + y + " is: " + gcd);
        sc.close();
    }
}