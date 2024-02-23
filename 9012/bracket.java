import java.util.*;
public class bracket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        Stack <Character> stack = new Stack();
        boolean isValid = true;


        for(char c : input.toCharArray()){

            if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                if(stack.isEmpty()){
                    isValid = false;
                    break;
                }
                stack.pop();

            }

        }

        if(!stack.isEmpty()){
            isValid = false;
        }

        if(isValid){
            System.out.println("Valid parentheses");
        }
        else{
            System.out.println("Invalid parentheses");
        }

    }

}
