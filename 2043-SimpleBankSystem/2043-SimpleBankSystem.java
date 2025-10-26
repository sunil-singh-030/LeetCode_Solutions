// Last updated: 10/26/2025, 9:32:50 AM
class Bank {
    long[] balanceArr;
    int n;
    public Bank(long[] balance) {
        n = balance.length;
        balanceArr = balance.clone();
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if (account1<1 || account2<1 || account1>n || account2>n){
            return false;
        }
        if (balanceArr[account1-1]<money){
            return false;
        }
        balanceArr[account1-1] -= money;
        balanceArr[account2-1] += money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if (account<1 || account>n){
            return false;
        }
        balanceArr[account-1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if (account<1 || account>n){
            return false;
        }
        if (balanceArr[account-1]<money){
            return false;
        }
        balanceArr[account-1] -= money;
        return true;


    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */