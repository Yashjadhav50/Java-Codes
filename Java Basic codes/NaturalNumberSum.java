import java.util.Scanner;
public class NaturalNumberSum{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Natural Number: ");
        int a = sc.nextInt(); 
        
        int sum = 0;
        for(int i = 1;i <= a; i++){
            sum += i;   
        }
        System.out.println("Sum of Natural numbers to "  + a + " is: " + sum);
        sc.close();
    }
}