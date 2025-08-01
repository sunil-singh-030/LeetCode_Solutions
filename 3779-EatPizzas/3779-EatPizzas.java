// Last updated: 8/1/2025, 7:01:25 AM
class Solution {
    public long maxWeight(int[] pizzas) {
        int n = pizzas.length;
        long weight = 0;
        Arrays.sort(pizzas);
        int chanceodd;
        if (n%8==0){
            chanceodd = n/8;
        }
        else{
            chanceodd = (n/8)+1;
        }
        int ind = n-1;
        for (int i=0 ; i<chanceodd ; i++){
            weight += pizzas[ind];
            ind--;
        }
        ind--;
        int chanceeven = n/4-chanceodd;
        for (int i=0 ; i<chanceeven ; i++){
            weight += pizzas[ind];
            ind -= 2;
        }
        return weight;
    }
}