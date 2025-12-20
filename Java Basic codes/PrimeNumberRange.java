import java.util.Scanner;
public class PrimeNumberRange{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Range of Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("Prime number Between " + x + " and " + y + " are: ");

        for(int num = x; num <= y; num++){
            if(isPrime(num)){
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
    static boolean isPrime(int n){
        
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
               return false;
            }
        }
        return true;
    }
}