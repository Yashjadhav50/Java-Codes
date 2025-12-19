import java.util.Scanner;
public class PowerOfNumber{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        System.out.print("Enter the Power of the Number: ");
        int p = sc.nextInt();
        int exp = Math.abs(p);                // it handles negative number
        double result = 1;                    // double is used to store floating point,Decimal numbers

        for(int i = 1; i <= exp; i++){
            result *= n;
        }

        if(p < 0){
            result = 1.0 / result;            // it handles negative power 
        }
        System.out.print(n + " raised to power " + p + " is: " + result);
        sc.close();
    }
}