// Last updated: 10/20/2025, 5:22:36 PM
class Solution {
    class Pair{
        String s;
        int dis;
        public Pair(String s, int dis){
            this.s = s;
            this.dis = dis;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int wordSize = wordList.get(0).length();
        HashMap<String,List<String>> adjMap = new HashMap<>();
        adjMap.put(beginWord,new ArrayList<>());
        for (String str : wordList){
            adjMap.put(str,new ArrayList<>());
        }
        int n = wordList.size();
        for (int i=0 ; i<n ; i++){
            String currStr = wordList.get(i);
            int cntDiffLetter = 0;
            for (int k=0 ; k<wordSize ; k++){
                if (beginWord.charAt(k)!=currStr.charAt(k)){
                    cntDiffLetter++;
                }
                if (cntDiffLetter>1){
                    break;
                }
            }
            if (cntDiffLetter==1){
                adjMap.get(beginWord).add(currStr);
                adjMap.get(currStr).add(beginWord);
            }
        }
        for (int i=0 ; i<n ; i++){
            String s1 = wordList.get(i);
            for (int j=i+1 ; j<n ; j++){
                String s2 = wordList.get(j);
                int cntDiffLetter = 0;
                for (int k=0 ; k<wordSize ; k++){
                    if (s1.charAt(k)!=s2.charAt(k)){
                        cntDiffLetter++;
                    }
                    if (cntDiffLetter>1){
                        break;
                    }
                }
                if (cntDiffLetter==1){
                    adjMap.get(s1).add(s2);
                    adjMap.get(s2).add(s1);
                }
            }
        } 
        System.out.println(adjMap);
        HashSet<String> visited = new HashSet<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(beginWord,1));
        while (!q.isEmpty()){
            // remove
            Pair currPair = q.poll();
            // ignore
            if (visited.contains(currPair.s)) continue;
            // mark visited
            visited.add(currPair.s);
            // self work
            if (currPair.s.equals(endWord)){
                return currPair.dis;
            }
            // add unvisited nbr
            for (String nbr : adjMap.get(currPair.s)){
                if (!visited.contains(nbr)){
                    q.offer(new Pair(nbr,currPair.dis+1));
                }
            }
        }
        return 0;
    }
}