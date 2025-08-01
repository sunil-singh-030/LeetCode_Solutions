// Last updated: 8/1/2025, 7:07:08 AM
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder out = new StringBuilder();
        long count=0;
        for (int i=s.length()-1;i>=0;i--){
            count+=shifts[i];
            out.append(shift(s.charAt(i),count));
        }
        out.reverse();
        return out.toString();
    }
    public static char shift(char ch,long count){
        count=count%26;
        int varch= (int) ch;
        varch+=count;
        if (varch>122){
            varch-=122;
            return (char) (96+varch);
        }
        else{
            return (char) (varch);
        }

    }
}