class sudo {
    private static int length_of_board;


    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '7', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        isValidSudoku(board);
    }

    public static boolean checkRow(char board[][], int row, int col, char ch) {
        for (int i = 0; i < length_of_board; i++) {
            if (i != col && board[row][i] == ch) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkCol(char board[][], int row, int col, char ch) {
        for (int i = 0; i < length_of_board; i++) {
            if (i != row && board[i][col] == ch) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkBox(char board[][], int row, int col, char ch) {
        int box_row = row - row % 3;
        int box_col = col - col % 3;
        for (int i = box_row; i < box_row + 3; i++) {
            for (int j = box_col; j < box_col + 3; j++) {
                if (i == row && j == col) {
                    continue;
                }
                if (board[i][j] == ch) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValidSudoku(char[][] board) {
        length_of_board = board.length;
        for (int i = 0; i < length_of_board; i++) {
            for (int j = 0; j < length_of_board; j++) {
                char ch = board[i][j];
                if (ch == '.') {
                    continue;
                }
                if (checkRow(board, i, j, ch)) {
                    return false;
                }
                if (checkCol(board, i, j, ch)) {
                    return false;
                }
                if (checkBox(board, i, j, ch)) {
                    return false;
                }
            }
        }
        return true;
    }
}