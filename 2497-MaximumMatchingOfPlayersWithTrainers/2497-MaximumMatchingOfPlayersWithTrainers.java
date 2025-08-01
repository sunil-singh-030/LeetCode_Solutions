// Last updated: 8/1/2025, 7:03:27 AM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int n = players.length;
        int m = trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int cntMatch = 0;
        int i=0;
        int j=0;
        while (i<n && j<m){
            if (players[i]<=trainers[j]){
                cntMatch++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return cntMatch;
    }
}