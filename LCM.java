import java.util.Scanner;
public class LCM{
    public static int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a, int b){
        return a * b / findGCD(a, b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two positive numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int lcm = findLCM(x , y);
        System.out.print("LCM of " + x + " and " + y + " is: " + lcm );

        sc.close();
    }
}