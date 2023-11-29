import java.util.Scanner;

public class NQueensApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of N which corresponds to the chessboard (N)x(N): ");
        int n = scanner.nextInt();

        if (n != 1 && n <= 3) {
            System.out.println("Invalid input. N must be 1 or greater than 3.");
            return;
        }

        Chessboard chessboard = new Chessboard(n);
        NQueensSolver solver = new NQueensSolver(chessboard);

        if (!solver.solveNQueens()) {
            System.out.println("No solution found.");
        }
    }
}