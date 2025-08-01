// Last updated: 8/1/2025, 7:08:45 AM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ls = new ArrayList<>();
        for (int i=1 ; i<=n ; i++){
            if (i%15==0){
                ls.add("FizzBuzz");
            }
            else if (i%3==0){
                ls.add("Fizz");
            }
            else if (i%5==0){
                ls.add("Buzz");
            }
            else{
                ls.add(String.valueOf(i));
            }
        }
        return ls;
    }
}