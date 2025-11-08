import java.util.Scanner;
public class AtoZusingloop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Alphabets using loop: ");
        for(char ch = 'a'; ch <= 'z' ; ch++){
            System.out.print(ch + " ");
        }
        sc.close();
    }
}