class main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row =0; row < board.length; row++) {
            for(int col = 0; col <board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
    }
}