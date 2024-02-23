import java.util.*;
public class bracket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String input = sc.next();

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

            if(!stack.isEmpty()){
                isValid = false;
            }
    
            if(isValid){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        }

    }

}
