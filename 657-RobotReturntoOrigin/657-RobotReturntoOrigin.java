// Last updated: 4/5/2026, 10:46:47 AM
class Solution {
    public boolean judgeCircle(String moves) {
        int vert = 0;
        int horizantal = 0;
        for (int i = 0; i < moves.length(); i++){
            if (moves.charAt(i) == 'D'){
                vert = vert-1;
            }
            if (moves.charAt(i) == 'U'){
                vert = vert+1;
            }
            if (moves.charAt(i) == 'R'){
                horizantal = horizantal-1;
            }
            if (moves.charAt(i) == 'L'){
                horizantal = horizantal+1;
            }
        }
        return horizantal == 0 && vert == 0;
    }
}