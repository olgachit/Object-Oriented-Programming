public class Two_Dimensional {
    public static void main(String[] args) {

        char[][] chessboard = {
                { 'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R' },
                { 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
                { 'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r' }
        };

        for (char[] row : chessboard) {
            for (char piece : row) {
                System.out.print(piece);
            }
            System.out.println();
        }
/*
        char[][] chessboard = new char[8][8];

        chessboard[0][0] = 'R';
        chessboard[0][1] = 'N';
        chessboard[0][2] = 'B';
        chessboard[0][3] = 'Q';

        chessboard[7][7] = 'r';
 */
        char[][][] mysticboard = new char[8][8][8];
        mysticboard[0][0][0] = 'R';
    }
}
