import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
public class PracticeQueue {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); 
        Queue <Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();


        for(int i=0; i<n; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            String command = st.nextToken(); //push,pop etc
            
            switch(command){
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                break;

                case "pop":
                    if(!queue.isEmpty()){
                        sb.append(queue.poll()).append("\n");
                    }
                    else{
                        sb.append("-1").append("\n");
                    }
                break;

                case "size":
                    sb.append(queue.size()).append("\n");
                break;

                case "empty":
                    if(queue.isEmpty()){
                        sb.append("-1").append("\n");
                    }
                    else{
                        sb.append("0").append("\n");
                    }
                break;

                case "front":
                    if(!queue.isEmpty()){
                        sb.append(queue.peek()).append("\n");
                    }
                    else{
                        sb.append("-1").append("\n");
                    }
                break;
                
                case "back":
                    if(!queue.isEmpty()){
                        for(int j=0; j<n-1; j++){
                        queue.remove();
                        }
                        sb.append(queue.peek()).append("\n");
                    }
                    else{
                        sb.append("-1").append("\n");
                    }                  
            }
        }
        System.out.println(sb);






    }
    
}