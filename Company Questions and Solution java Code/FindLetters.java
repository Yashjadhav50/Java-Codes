import java.util.Scanner;
public class FindLetters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name and surname: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");

        if(s.trim().isEmpty()){
            System.out.println("Input Empty");
        }else{
            char firstletter = Character.toUpperCase(words[0].charAt(0));

            String lastword = words[words.length - 1];
            char lastletter = Character.toUpperCase(lastword.charAt(lastword.length() - 1));

            System.out.println(firstletter + "." + lastletter);

        }
        sc.close();
    }
}