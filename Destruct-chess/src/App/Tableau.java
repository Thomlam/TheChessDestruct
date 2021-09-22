package App;

public class Tableau {

    public static void ShowMyBoard() {


        String[][] board = new String[12][12];


        System.out.println( "0  1   2   3   4   5   6   7   8   9   10  11" );

        for (int i = 1; i < (board.length - 1); i++) {

            String line = i + " ";
            for (int j = 0; j < (board[0].length - 1); j++) {

                board[i][j] = ("[ ] ");

                line += board[i][j];
            }

            System.out.println(line);
        }
    }
}
