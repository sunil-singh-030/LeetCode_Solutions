// Last updated: 8/1/2025, 7:07:28 AM
class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        int[] firstind = new int[26];
        Arrays.fill(firstind,-1);
        int[] lastind = new int[26];
        Arrays.fill(lastind,-1);
        char[] arr = s.toCharArray();
        for (int i=0 ; i<n ; i++){
            char ch = arr[i];
            if (firstind[ch-'a']==-1){
                firstind[ch-'a'] = i;
                lastind[ch-'a'] = i;
            }
            else{
                lastind[ch-'a'] = i;
            }
        }
        List<Integer> ls = new ArrayList<>();
        int ci = 0;
        while (ci<n){
            int temp = ci;
            int prev = ci;
            ci = lastind[arr[ci]-'a'];
            int maxdi = ci;
            for (int i=temp+1 ; i<ci ; i++){
                maxdi = Math.max(maxdi,lastind[arr[i]-'a']);
            }
            if (maxdi>ci){
                temp = ci;
                ci = maxdi;
                while (temp!=ci){
                    for (int i=temp+1 ; i<ci ; i++){
                        maxdi = Math.max(maxdi,lastind[arr[i]-'a']);
                    }
                    temp = ci;
                    ci = Math.max(ci,maxdi);
                }
            }
            ls.add(ci-prev+1);
            ci++;
        }
        return ls;
    }
}