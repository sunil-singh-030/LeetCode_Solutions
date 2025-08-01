// Last updated: 8/1/2025, 7:08:32 AM
class Solution {
    public int compress(char[] chars) {
        if (chars.length<2){
            return 1;
        }
        ArrayList<Character> ls=new ArrayList<Character>();
        int c=1;
        char ch=chars[0];
        for (int i=1;i<chars.length;i++){
            if (chars[i]==ch){
                c++;
            }
            else{
                ls.add(ch);
                if (c>1){
                    String s=String.valueOf(c);
                    for (int j=0;j<s.length();j++){
                        ls.add(s.charAt(j));
                    }
                }
                ch=chars[i];
                c=1;
            }
        }
        ls.add(ch);
        if (c>1){
                    String s=String.valueOf(c);
                    for (int j=0;j<s.length();j++){
                        ls.add(s.charAt(j));
                    }
                }
        for (int i=0;i<ls.size();i++){
            //System.out.print(ls.get(i)+" ");
            chars[i]=ls.get(i);
        }
        return ls.size();
    }
}