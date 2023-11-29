

public class Chessboard {
    private int[][] board;
    private int size;

    public Chessboard(int size) {
        this.size = size;
        this.board = new int[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public int[][] getBoard() {
        return board;
    }
}

