import java.util.Scanner;
public class NumberPalindromeChecker{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;

        while(n != 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        if(original == reversed){
            System.out.print(original + " is a Palindrome.");
        }else{
            System.out.print(original + " is not a Plaindrome.");
        }
        sc.close();
    }
}