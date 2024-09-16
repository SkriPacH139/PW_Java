import java.util.Scanner;

public class Game {
    private char[][] board;
    private _Player player1;
    private _Player player2;
    private _Player currentPlayer;
    private int size;

    public Game(int size, _Player player1, _Player player2) {
        this.size = size;
        this.board = new char[size][size];
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.println("Ход игрока " + currentPlayer.getSymbol());
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                makeMove(row, col);
                if (isGameOver()) {
                    printBoard();
                    System.out.println("Игра окончена! Победил игрок " + currentPlayer.getSymbol());
                    break;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("Ничья!");
                    break;
                }
                switchPlayer();
            } else {
                System.out.println("Неверный ход. Попробуйте снова.");
            }
        }
        scanner.close();
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size && board[row][col] == ' ';
    }

    private void makeMove(int row, int col) {
        board[row][col] = currentPlayer.getSymbol();
    }

    private boolean isGameOver() {
        return checkRows() || checkCols() || checkDiagonals();
    }

    private boolean checkRows() {
        for (int i = 0; i < size; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkCols() {
        for (int j = 0; j < size; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        }
        else {
            currentPlayer = player1;
        }
    }

    private void printBoard() {
        System.out.println("Доска:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

