// Last updated: 8/1/2025, 7:07:13 AM
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        for (int turn=1;turn<profit.length;turn++) {
			for (int i=0;i<profit.length-turn;i++) {
				if (profit[i]>profit[i+1]) {
					int temp=profit[i];
					profit[i]=profit[i+1];
					profit[i+1]=temp;
                    int temp1=difficulty[i];
					difficulty[i]=difficulty[i+1];
					difficulty[i+1]=temp1;
				}
			}
		}
        int tprofit=0;
        for (int wd :worker){
            int prfit=0;
            for (int i=profit.length-1;i>=0;i--){
                if (difficulty[i]<=wd){
                    prfit=profit[i];
                    break;
                }
            }
            tprofit+=prfit;
        }
        return tprofit;
    }
}