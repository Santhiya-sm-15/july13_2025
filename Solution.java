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