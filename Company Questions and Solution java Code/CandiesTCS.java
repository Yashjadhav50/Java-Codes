import java.util.Scanner;
public class CandiesTCS{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = 10;                                                 // Maximum no of candies in jar
        System.out.println("Total number of Candies in jar: " + n);
        while(true){
            System.out.print("Enter Number of Candies you want: ");
            int k = sc.nextInt();
            if(k <= 0){
                System.out.println("Invalid Input.");
                break;
            }else if(k > n){
                System.out.println("Not enough Candies in the jar. Only " + n + " left.");
            }else if(k > 5){
                System.out.println("you can only take a maximum of 5 Candies.");
            }else{
                System.out.println("Number of candies you take: " + k);
                int m = n - k;
                System.out.println("Remaining number of candies: " + m);

                // if candies are 5 or less than 5 then jar will be refilled.
                if(m <= 5){
                    n = 10;
                    System.out.println("Jar is refilled to " + n + " Candies.");
                }else{
                    n = m;
                }
            }
        }
        sc.close();
    }
}