import java.util.*;

public class practice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //6을 입력, num=6
        if(n>1 & n<10){
            for(int i=9; i>=n; i-=3){
                //num=6일때 i=9,6
                for(int j=1;j<=9;j++){
                    //j=1부터 9까지
                    for(int k=0; k<3; k++){
                        //3번반복
                        int x=i-k;
                        //x=9-0, 9-1, 9-2
                        //x=6-0, 6-1, 6-2
                        if(x<n){
                        //
                            break;
                        }
                        System.out.print(x+" * "+ j + " = " + x*j +"\t");
                    }
                    System.out.println();              
                }
                System.out.println();
            }
        }
        else{
            System.out.println("");
        }


    }

}