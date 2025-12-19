// Last updated: 12/19/2025, 11:54:17 AM
class ExamTracker {
    List<Integer> t = new ArrayList<>();
    List<Long> s = new ArrayList<>();
    public ExamTracker() {
        
    }
    
    public void record(int time, int score) {
        if (t.size()==0){
            t.add(0);
            s.add((long) 0);
        }
        t.add(time);
        s.add(s.get(s.size()-1)+(long)score);
    }
    
    public long totalScore(int startTime, int endTime) {
        long sum = 0;
        int si = -1;
        int ei = -1;
        int st = 0;
        int end = t.size()-1;
        while (st<=end){
            int mid = (st+end)/2;
            if (t.get(mid)>=startTime){
                si = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        if (si==-1) return 0;
        st = 0;
        end = t.size()-1;
        while (st<=end){
            int mid = (st+end)/2;
            if (t.get(mid)>endTime){
                end = mid-1;
            }
            else{
                ei = mid;
                st = mid+1;
            }
        }
        return s.get(ei)-s.get(si-1);
    }
}

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */