import java.util.Scanner;
public class PositiveNegative{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    if(n<0){
        System.out.println("Number " + n + " is negative.");
    }else if(n>0){
        System.out.println("Number " + n + " is positive.");
    }else{
        System.out.println("Entered Number is zero.");
    }
    sc.close();
    }
}