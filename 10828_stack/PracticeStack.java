import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;
import java.util.Stack;
public class PracticeStack {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Stack <Integer> stack =  new Stack();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
        

            switch(type){
                case "push":
                    stack.push(Integer.parseInt(st.nextToken())); 
                    break;
                case "pop":
                    if(!stack.isEmpty()){
                        sb.append(stack.pop()).append("\n");
                    }
                    else{
                        sb.append("-1").append("\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        sb.append("1").append("\n");
                    }
                    else{
                        sb.append("0").append("\n");
                    }
                    break;
                case "top":
                    if(!stack.isEmpty()){
                        sb.append(stack.peek()).append("\n");
                    }
                    else{
                        sb.append("-1").append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
