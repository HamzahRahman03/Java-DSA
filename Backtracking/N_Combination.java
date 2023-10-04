public class N_Combination {
    public  static void main(String  [] args){
        int n = 2;
        int b = 4;   
        boolean[] board = new boolean[b];
        Combination(board, n, "", 0, 0);     
    }
    
    public static void Combination(boolean [] board, int n, String ans, int qpsf, int idx){
        if(qpsf==n){
            System.out.println(ans);
            return;
        }

        for(int i = idx; i<board.length; i++){
            if(board[i]==false){
                board[i] = true;
                Combination(board, n, ans + "b" + i + "q" + qpsf, qpsf + 1, i+1);
                board [i] = false;
            }
        }

    }
}
