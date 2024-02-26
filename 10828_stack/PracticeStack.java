import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class PracticeStack {
    public static void main(String[] args) throws IOException {
        
        Stack <String> stack = new Stack();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int n = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<n; i++){
            String type = bf.readLine();
            String arr[] = type.split(" ");
            String result = "";
            
            if(arr[0].equals("push")){
                result = stack.push(arr[1]);
            }
            else if(arr[0].equals("top")){
                if(stack.isEmpty()){
                    result = stack.peek();
                }
                else{
                    result = "-1";
                }
            }
            else if(arr[0].equals("size")){
                result = String.valueOf(stack.size());
            }
            else if(arr[0].equals("empty")){
                result = stack.isEmpty() ? "1" : "0" ;
            }
            else if(arr[0].equals("pop")){
                if(stack.isEmpty()){
                    result = stack.pop();
                }
                else{
                    result = "-1";
                }
            }

            bw.write(result + "\n");

            
        } 
        bw.close();
    }    
}
