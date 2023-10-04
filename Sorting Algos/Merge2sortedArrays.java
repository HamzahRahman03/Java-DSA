import java.util.*;
public class Merge2sortedArrays {
    public static void main(String [] args){
        int [] a1 = {2,3,4,5,7,8,11};
        int [] a2 = {1,2,5,6,9,11,13,14};
        int [] ans = Merge(a1,a2);

        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
 
    public static int [] Merge(int [] a1, int [] a2){
        int [] ans = new int [a1.length + a2.length];
        int i = 0;
        int j = 0, k = 0;

        while(i<a1.length && j<a2.length){
            if(a1[i] < a2[j]){
                ans[k] = a1[i];
                i++;
                k++;
            }

            else{
                ans[k] = a2[j];
                j++;
                k++;
            }
        }

        while(i < a1.length){
            ans[k] = a1[i];
            i++;
            k++;
        }

        while(j < a2.length){
            ans[k] = a2[j];
            j++;
            k++;
        }

        return ans;
    }
}
