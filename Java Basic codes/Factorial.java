import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive Number: ");
        int f = sc.nextInt();
        
    
        if(f < 0){
            System.out.println("Factorial is not Defined.");
        }else{
            long factorial = 1;
            for(int i = 1; i <= f; i++){
                factorial *= i;
            }
             System.out.println("Factorial of number is: " + factorial);
        }
        sc.close();
    }
}