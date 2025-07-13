# july13_2025
The problem that i solved today in leetcode

You are given a 0-indexed integer array players, where players[i] represents the ability of the ith player. You are also given a 0-indexed integer array trainers, where trainers[j] represents the training capacity of the jth trainer.

The ith player can match with the jth trainer if the player's ability is less than or equal to the trainer's training capacity. Additionally, the ith player can be matched with at most one trainer, and the jth trainer can be matched with at most one player.

Return the maximum number of matchings between players and trainers that satisfy these conditions.

Code:
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n=players.length;
        int m=trainers.length;
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(players[i]<=trainers[j])
            {
                i++;
                j++;
            }
            else
                j++;
        }
        return i;
    }
}
