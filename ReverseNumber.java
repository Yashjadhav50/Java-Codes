import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int s = sc.nextInt();
        int reversed = 0;
        int temp = Math.abs(s);
        
        while(temp != 0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        if (s < 0){
            reversed = -reversed;
        }
        System.out.print("Reversed number is: " + reversed);
        sc.close();
    } 
}