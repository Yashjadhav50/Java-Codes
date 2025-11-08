import java.util.*;
import java.lang.String;
public class ReversePolishNotation{
    public static int evaluate(String[] input){
        Stack<Integer> st = new Stack<>();
        for(String ip : input){
            if("+-*/".contains(ip)){
                int top = st.pop();                          // topofstack
                int second = st.pop();                       // secondtopofstack
                switch(ip){
                    case "+" : st.push(second + top);break;
                    case "-" : st.push(second - top);break;
                    case "*" : st.push(second * top);break;
                    case "/" : st.push(second / top);break;
                }
            }
            else{
                st.push(Integer.parseInt(ip));
            }
        }
        return st.pop();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Reverse Polish Notation expression (tokens separated by spaces:");
        String line = sc.nextLine();

        String[] tokens = line.trim().split("\\s+");

        int result = evaluate(tokens);
        System.out.println("Result: " + result);

        sc.close();
    }
}