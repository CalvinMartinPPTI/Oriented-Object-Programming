package titactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');
        Player currentPlayer = player1;
        
        while (true) {
            board.printBoard();
            System.out.println(currentPlayer.getName() + "'s turn. Enter row and column (0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            
            if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                if (Checker.checkWin(board.getBoard(), currentPlayer.getSymbol())) {
                    board.printBoard();
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                }
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
        scanner.close();
    }
}
