public class Dice3Sum4 { //Dice has values 1 2 3
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
                
        DiceRoll(n, sum+1, ans + 1);
        DiceRoll(n, sum+2, ans + 2);
        DiceRoll(n, sum+3, ans + 3);
    }
    
}
