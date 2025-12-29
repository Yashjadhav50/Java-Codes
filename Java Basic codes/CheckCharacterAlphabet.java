import java.util.Scanner;
public class CheckCharacterAlphabet{
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        String a = sc.next();
                                                                       
        if(a.length() == 1 && ((a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z'))){   
            System.out.println( a + " is Alphabet.");                 
        }else{
            System.out.println( a + " is not a Alphabet.");
        }

        if(a.length() == 1 && Character.isLetter(a.charAt(0))){ //Using build-in java method Character.isLetter() 
            System.out.println( a + " is Alphabet.");                  
        }else{
            System.out.println( a + " is not a Alphabet.");
        }
        sc.close();
    }
}