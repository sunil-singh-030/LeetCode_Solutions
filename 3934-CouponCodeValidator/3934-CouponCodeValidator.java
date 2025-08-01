// Last updated: 8/1/2025, 7:00:46 AM
class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n = code.length;
        HashSet<String> set = new HashSet<>();
        set.add("electronics");
        set.add("grocery");
        set.add("pharmacy");
        set.add("restaurant");
        boolean[] isvalid = new boolean[n];
        for (int i=0 ; i<n ; i++){
            if (isActive[i] && set.contains(businessLine[i])){
                String cod = code[i];
                if (cod.length()==0){
                    continue;
                }
                boolean flag = true;
                for (char ch : cod.toCharArray()){
                    if (ch-'0'>=0 && ch-'0'<=9){
                        continue;
                    }
                    if (ch=='_'){
                        continue;
                    }
                    if (ch-'a'>=0 && ch-'a'<=25){
                        continue;
                    }
                    if (ch-'A'>=0 && ch-'A'<=25){
                        continue;
                    }
                    flag = false;
                    break;
                }
                if (flag){
                    isvalid[i] = true;
                }
            }
        }
        List<String> codenew = new ArrayList<>();
        List<String> busline = new ArrayList<>();
        for (int i=0 ; i<n ; i++){
            if (isvalid[i]){
                codenew.add(code[i]);
                busline.add(businessLine[i]);
            }
        }
        
        for (int len=1 ; len<codenew.size() ; len++){
            for (int i=0 ; i<codenew.size()-len ; i++){
                String s1 = busline.get(i);
                String s2 = busline.get(i+1);
                String c1 = codenew.get(i);
                String c2 = codenew.get(i+1);
                if (s1.compareTo(s2)>0){
                    codenew.set(i,c2);
                    codenew.set(i+1,c1);
                    busline.set(i,s2);
                    busline.set(i+1,s1);
                }
                else if (s1.equals(s2)){
                    if (c1.compareTo(c2)>0){
                        codenew.set(i,c2);
                        codenew.set(i+1,c1);
                        busline.set(i,s2);
                        busline.set(i+1,s1);
                    }
                }
                // System.out.println(codenew);
                // System.out.println(busline);
            }
        }
        //System.out.println("restaurant".compareTo("electronics"));
        return codenew;
    }
}