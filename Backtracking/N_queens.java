public class N_queens{

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        Queen(board, 0, n);
    }

    public static void Queen(boolean[][] board, int row, int tq) {

        for (int col = 0; col < board[0].length; col++) {
            if(tq==0){
                Display(board);
                return;
            }

            if (IsItPossible(board, row, col) == true) {
                board[row][col] = true;
                Queen(board, row + 1, tq - 1);
                board[row][col] = false;
            }
        }
    }

    public static boolean IsItPossible(boolean[][] board, int row, int col){
        int r = row;
        while(r>=0){
            if(board[r][col] == true){
                return false;
            }
            r--;
        }

        int c = col;
        r = row;
        //right diagonal
        while(r>=0 && c<board[0].length){
            if(board[r][c] == true){
                return false;
            }
            r--;
            c++;
        }

        c = col;
        r = row;
        //left diagonal
        while(r>=0 && c>=0){
            if(board[r][c] == true){
                return false;
            }
            r--;
            c--;
        }
        return true;
    }

    public static void Display(boolean[][] board){
        for(int i =0; i<board.length; i++){
            for(int j =0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
