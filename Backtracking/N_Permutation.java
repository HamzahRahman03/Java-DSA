public class N_Permutation {
    public  static void main(String  [] args){
        int n = 2;
        int b = 4;   
        boolean[] board = new boolean[b];
        Permutation(board, n, "", 0);     
    }
    
    public static void Permutation(boolean [] board, int n, String ans, int qpsf){
        if(qpsf==n){
            System.out.println(ans);
            return;
        }

        for(int i =0; i<board.length; i++){
            if(board[i]==false){
                board[i] = true;
                Permutation(board, n, ans + "b" + i + "q" + qpsf, qpsf + 1);
                board [i] = false;
            }
        }

    }
}
