import java.util.*;

public class fibo{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 2 || n >= 45) {
            System.out.println("fail");
            return;
        }

        int[] fibonacci = new int[n];
        int first =1;
        int second = 1;
        int temp = 0; 
        for(int i=0; i<n; i++){
            fibonacci[i] = second;
            if(Integer.MAX_VALUE-first >= second){
                temp = first + second;
                first = second;
                second = temp;
            }else{
                System.out.println(i);
                System.out.println(fibonacci[45]);
                break;
            }
        }

        int oddCount = 0;
        for(int i=0; i<n;i++){
            if(fibonacci[i] % 2 !=0){
                oddCount++;
            }
        }
        

        int sum=0;
        int line=0;
        for(int i=1; sum<=oddCount; i++){
            //sum<=5
            sum+=i;
            line++;
        }

        for(int i=1; i<line;i++){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}