public class Leetcode17_LetterCombinationOfPhoneNo{
    static String [] code ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String [] args){
        String ques = "23";
        Keypad(ques, "");
    }

    public static void Keypad(String ques, String ans){
        if (ques.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        
        char ch = ques.charAt(0);
        int idx = ch - '0';
        String press = code[idx];

        for ( int i =0; i < press.length(); i++){
            Keypad(ques.substring(1), ans + press.charAt(i));
        }
    }
}