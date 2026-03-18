package Arrays.SlidingWindow;

class TicTacToe {
    public String tictactoe(int[][] moves) {
        // We have 3 rows, 3 columns, 1 main diagonal, and 1 anti-diagonal
        int[] rows = new int[3];
        int[] cols = new int[3];
        int diag = 0;
        int antiDiag = 0;

        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];

            // Player A (even index) is +1, Player B (odd index) is -1
            int val = (i % 2 == 0) ? 1 : -1;

            // Update the counters
            rows[r] += val;
            cols[c] += val;

            if (r == c) diag += val;
            if (r + c == 2) antiDiag += val;

            // Check if anyone reached 3 or -3 in this move
            if (Math.abs(rows[r]) == 3 || Math.abs(cols[c]) == 3 ||
                    Math.abs(diag) == 3 || Math.abs(antiDiag) == 3) {
                return (val == 1) ? "A" : "B";
            }
        }

        // If no winner, check if board is full (9 moves) or still pending
        return (moves.length == 9) ? "Draw" : "Pending";
    }
}


//In this problem, moves is a list of coordinates where players placed their marks.
//If the input is moves = [[0,0], [2,0], [1,1]], it looks like this in memory:
//
//moves[0] is [0,0] (First move)
//
//moves[1] is [2,0] (Second move)
//
//moves[2] is [1,1] (Third move)


//for (int i = 0; i < moves.length; i++) {
//What it does: This is a standard loop that goes through every "move" in the list.
//
//i is the index of the current move (0, 1, 2...).


//int r = moves[i][0];
//The Logic: You are going to the i-th move and picking the first number in that small array.
//
//What it represents: In Tic-Tac-Toe, the first number is always the Row (horizontal line).
//
//Example: If i = 1, moves[1] is [2,0]. So, moves[1][0] is 2. Now, r = 2.

//int c = moves[i][1];
//The Logic: You are going to the i-th move and picking the second number.
//
//What it represents: The second number is the Column (vertical line).
//
//Example: For that same move moves[1], moves[1][1] is 0. Now, c = 0.

//
//Why are we doing this?
//Once you have r (Row) and c (Column), the code can now "mark" the board.
//Instead of looking at the move as a list like [0,0], the computer now sees it as: "Okay, Player placed a mark at Row 0 and Column 0."

//2. What the lines actually do:
//Imagine you have two "scorecards" (arrays) initialized to zero:
//
//rows = [0, 0, 0] (Tracks total points in Row 0, Row 1, Row 2)
//
//cols = [0, 0, 0] (Tracks total points in Col 0, Col 1, Col 2)

//rows[r] += val;
//This says: "Go to the row where the move just happened (r) and add the player's value to its total."
//
//cols[c] += val;
//This says: "Go to the column where the move just happened (c) and add the player's value to its total."