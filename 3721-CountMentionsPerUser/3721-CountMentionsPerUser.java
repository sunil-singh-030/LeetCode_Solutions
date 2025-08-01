// Last updated: 8/1/2025, 7:01:45 AM
import java.util.regex.*;
class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        for (int len=1;len<events.size();len++){
            for (int i=0;i<events.size()-len;i++){
                int t1=Integer.parseInt(events.get(i).get(1));
                int t2=Integer.parseInt(events.get(i+1).get(1));
                if (t1>t2){
                    List<String> l1=events.get(i);
                    events.set(i,events.get(i+1));
                    events.set(i+1,l1);
                }
                else if (t1==t2){
                    String str1=events.get(i).get(0);
                    String str2=events.get(i+1).get(0);
                    if (!str1.equals(str2) && str1.equals("MESSAGE")){
                        List<String> l1=events.get(i);
                        events.set(i,events.get(i+1));
                        events.set(i+1,l1);
                    }
                }
            }
        }
        //System.out.println(events);
        int [] ans=new int[numberOfUsers];
        boolean [] aval=new boolean[ans.length];
        int [] time =new int[ans.length];
        for (int i=0;i<events.size();i++){
            for (int j=0;j<ans.length;j++){
                if (aval[j]){
                    if (Integer.valueOf(events.get(i).get(1))>=time[j]){
                        aval[j]=false;
                    }
                }
            }
            if (events.get(i).get(0).equals("MESSAGE")){
                if (events.get(i).get(2).equals("ALL")){
                    for (int j=0;j<ans.length;j++){
                        ans[j]++;
                    }
                }
                else if (events.get(i).get(2).equals("HERE")){
                    for (int j=0;j<ans.length;j++){
                        if (!aval[j]){
                            ans[j]++;
                        }
                    }
                }
                else {
                    String s=events.get(i).get(2);
                    Pattern pattern=Pattern.compile("\\d+");
                    Matcher matcher=pattern.matcher(s);
                    List<Integer> number=new ArrayList<>();
                    while (matcher.find()){
                        number.add(Integer.parseInt(matcher.group()));
                    }
                    for (int j=0;j<number.size();j++){
                        ans[number.get(j)]++;
                    }
                }
                
            }
            else{
                int id = Integer.parseInt(events.get(i).get(2));
                aval[id]=true;
                time[id]= Integer.valueOf(events.get(i).get(1))+60;
            }
            
        }
        return ans;
    }
}