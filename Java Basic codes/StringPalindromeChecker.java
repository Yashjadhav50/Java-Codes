import java.util.Scanner;
public class StringPalindromeChecker{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String str = sc.next();
        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        if(str.equalsIgnoreCase(reversed)){
        
            System.out.print(str + " is a Palindrome.");
        }else{
            System.out.print(str + " is not a Plaindrome.");
        }
        sc.close();
    }
}