package Arrays.SlidingWindow;


class FirstPlayerToWinKGamesInaRow {
    public int findWinningPlayer(int[] skills, int k) {
        //IMP CONCEPT -> when my k is greater than equal to (n-1) -> mex integer array elemnt is winner
        // when my 'k' is lesser than 'n' -> I need to repeat the dequue process put in the end and just keep on repeating it.

        // The current 'champion' starts at index 0
        int currentWinnerIndex = 0;

        //its consecutiveWins = 0
        int consecutiveWins = 0;

        // Iterate through the players starting from the second one (index 1)
        for(int i=1; i < skills.length;i++){

            // Compare current champion with the next player in line
            if(skills[i] > skills[currentWinnerIndex]){
                currentWinnerIndex = i; // We have a new champion!
                consecutiveWins = 1; // They just got their first win
            } else{

                // Current champion wins again
                consecutiveWins++;
            }

            // Check if the current champion reached k wins
            if(consecutiveWins == k){
                return currentWinnerIndex;
            }
        }

        // If we finish the loop and no one reached k wins,
        // the current winner must be the player with the highest skill level.
        // They will eventually win all remaining games.
        return currentWinnerIndex;

    }
}