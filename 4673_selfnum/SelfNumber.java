public class SelfNumber {
    public static void main(String[] args) {
        
        boolean [] check = new boolean[10001];
            

        for(int i=0; i<10001; i++){
            int result = SF(i);

            if(result<10001){
                check[result] = true;
            }
        }

        for(int i=0; i<10001; i++){
            if(!check[i]){
                System.out.println(i);
            }
        }
        
    }

    public static int SF(int num){
        int sum =0;
        while(num!=0){
            sum = num + (num%10); //num%10-> 나머지 
            num = num/10; // num/10->몫 num=3
        }

        return sum;
    }
}
