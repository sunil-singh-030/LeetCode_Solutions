// Last updated: 8/1/2025, 7:05:52 AM
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        HashSet<String> set = new HashSet<>();
        List<String> ls = new ArrayList<>();
        for (String s : folder){
            boolean iscontain = false;
            StringBuilder sb = new StringBuilder();
            int ind = 0;
            while (ind<s.length()){
                sb.append(s.charAt(ind));
                ind++;
                while (ind<s.length() && s.charAt(ind)!='/'){
                    sb.append(s.charAt(ind));
                    ind++;
                }
                if (set.contains(sb.toString())){
                    iscontain = true;
                    break;
                }
            }
            if (!iscontain){
                set.add(s);
                ls.add(s);
            }
        }
        return ls;
    }
}