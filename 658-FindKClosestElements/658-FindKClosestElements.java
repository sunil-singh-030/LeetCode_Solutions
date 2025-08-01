// Last updated: 8/1/2025, 7:07:47 AM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ls=new ArrayList<Integer>();
        PriorityQueue<Integer> pq =  new PriorityQueue<>();
        int ind = 0;
        int st = 0;
        int end = arr.length-1;
        while (st<=end){
            int mid = (st+end)/2;
            if (arr[mid]>x){
                end = mid-1;
            }
            else{
                ind = mid;
                st = mid+1;
            }
        }
        int left = ind;
        int right = ind+1;
        int c = 0;
        while (left>=0 && right<arr.length && c<k){
            int n1 = Math.abs(arr[left]-x);
            int n2 = Math.abs(arr[right]-x);
            if (n1<=n2){
                pq.add(arr[left]);
                left--;
            }
            else{
                pq.add(arr[right]);
                right++;
            }
            c++;
        }
        if (left==-1){
            while (c<k && right<arr.length){
                pq.add(arr[right]);
                right++;
                c++;
            }
        }
        if (right==arr.length){
            while (c<k && left>=0){
                pq.add(arr[left]);
                left--;
                c++;
            }
        }
        while (!pq.isEmpty()){
            ls.add(pq.poll());
        }
        return ls;
    }
}