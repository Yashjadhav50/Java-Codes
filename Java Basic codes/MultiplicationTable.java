import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args){
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Positive number: ");
        int x = obj.nextInt();
        System.out.println("Multiplication Table for number: " + x);

        for(int i = 1; i<=10; i++){
            int result = x * i;
            System.out.println( x + " X " + i + " is " + result);
        }
    obj.close();
    }
}