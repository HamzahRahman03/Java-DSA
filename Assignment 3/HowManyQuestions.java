import java.util.*;
public class HowManyQuestions {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int count = 0;
        for(int i = 0; i<n; i++){
            int [] arr = new int[3];

            for(int j = 0; j<3; j++){
                arr[j] = sc.nextInt();
            }

            int sum = YESorNO(arr);
            if(sum>=2){
                count++;
            }
        }

        System.out.println(count);
    }
    
    public static int YESorNO(int[] arr){
        int sum = 0;
        for(int i = 0; i<3; i++){
            sum+= arr[i];
        }

        return sum;
    }
}
