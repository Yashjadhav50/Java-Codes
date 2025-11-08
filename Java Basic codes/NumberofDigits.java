import java.util.Scanner;
public class NumberofDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integers: ");
        int n = sc.nextInt();
        
        int count = 0;
        int temp = Math.abs(n);

        if(temp == 0){
            count = 1;
        }else{
            while(temp > 0){
                temp = temp / 10;
                count++;
            }
        }

        System.out.print("Numbers of digits in " + n + " is: " + count);
        sc.close();
    }
}