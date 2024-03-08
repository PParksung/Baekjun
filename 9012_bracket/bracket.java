import java.util.*;
public class bracket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String inputs [] = new String[n];

        for(int i=0; i<n; i++){
            inputs[i] = sc.nextLine();
        }

        for(String input : inputs){
            String result = "";
            if(isValidParentheses(input)){
                result = "YES";
            }
            else{
                result = "NO";
            }
            System.out.println(result);
        }
        sc.close();
    }
    public static boolean isValidParentheses(String input){
        
        Stack <Character> stack = new Stack<>();
        
        for(char c : input.toCharArray()){
            if(c=='('){
                stack.push(c);
            }
            else if(stack.isEmpty()){
                return false;
            }
            else{
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }


    }
}

