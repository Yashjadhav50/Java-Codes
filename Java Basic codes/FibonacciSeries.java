import java.util.Scanner;
public class FibonacciSeries{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Positive number of terms: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.print("Please Enter a Positive number greater than 0: ");
        }else{
            System.out.println("Fibonacci Series up to " + n + " terms is: ");

            int first = 0;
            int second = 1;

            for(int i = 1; i <= n; i++){
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
        sc.close();
    }
}