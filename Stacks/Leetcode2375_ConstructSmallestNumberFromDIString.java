import java.util.Stack;

// Linear complexity O(n)

public class Leetcode2375_ConstructSmallestNumberFromDIString {
    public static void main(String [] args){
        String str = "DDIIDD";  //IIIDIDDD
        System.out.println(Smallest_number(str));
    }

    public static String Smallest_number(String str){
        Stack <Integer> st = new Stack <>();
        int[] ans = new int [str.length() + 1];
        int count = 1;

        for(int i = 0; i <= str.length(); i++){
            if(i == str.length() || str.charAt(i) == 'I'){
                ans[i] = count;
                count++;

                while(!st.isEmpty()){
                    ans[st.pop()] = count;
                    count++;
                }
            }

            else{
                st.push(i);
            }
        }

        String s = "";

        for(int i = 0; i<ans.length; i++){
            s = s  + ans[i];
        }

        return s;
    }
    
}
