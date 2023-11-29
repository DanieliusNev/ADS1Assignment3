public class NQueensSolver {
    private Chessboard chessboard;

    public NQueensSolver(Chessboard chessboard) {
        this.chessboard = chessboard;
    }

    public boolean solveNQueens() {
        return solveNQueensUtil(chessboard.getBoard(), 0, chessboard.getSize());
    }

    private boolean solveNQueensUtil(int board[][], int col, int queensToPlace) {
        if (queensToPlace == 0) {
            chessboard.printBoard();
            return true;
        }

        boolean solutionFound = false;
        for (int i = 0; i < chessboard.getSize(); i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                solutionFound = solveNQueensUtil(board, col + 1, queensToPlace - 1) || solutionFound;
                board[i][col] = 0;
            }
        }

        return solutionFound;
    }

    private boolean isSafe(int board[][], int row, int col) {
        // checks if there is a queen in same row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }


        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; j >= 0 && i < chessboard.getSize(); i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}