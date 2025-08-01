// Last updated: 8/1/2025, 7:06:30 AM
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int [] arr=new int[deck.length];
        int c=0;
        for (int i=0;i<deck.length;i+=2){
            arr[i]=deck[c];
            c++;
        }
        List<Integer> ls=new ArrayList<>();
        for (int i=1;i<deck.length;i+=2){
            ls.add(i);
        }
        int len=deck.length;
        while (ls.size()!=0){
            if (len%2==1){
                int num=ls.get(0);
                ls.remove(0);
                ls.add(num);
            }
            len=ls.size();
            for (int i=0;i<ls.size();i+=1){
                arr[ls.get(i)]=deck[c];
                c++;
                ls.remove(i);
            }
        }
        return arr;
    }
}