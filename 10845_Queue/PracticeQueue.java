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
        int last = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken(); //push,pop etc
            
            switch(command){
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    queue.offer(last);
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
                        sb.append("1").append("\n");
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
                        sb.append(last).append("\n");
                    }
                    else{
                        sb.append("-1").append("\n");
                    }                  
            }
        }
        System.out.println(sb);






    }
    
}