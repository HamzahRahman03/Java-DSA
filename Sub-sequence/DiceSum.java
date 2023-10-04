public class DiceSum {
    public static void main(String [] args){
        int n = 4;
        int sum = 0;
        DiceRoll(n, sum,  "");
    }

    public static void DiceRoll(int n, int sum, String ans){
        if (sum==n){
            System.out.print(ans + " ");
        }

        if(sum>n){
            return;
        }
                
        for(int dice =1; dice<=6; dice++){
            DiceRoll(n, sum+dice, ans + dice);
    }
    }
    
}
