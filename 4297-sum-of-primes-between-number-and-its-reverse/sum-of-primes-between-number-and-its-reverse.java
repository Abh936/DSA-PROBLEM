class Solution {
    public int reverse(int n){
        int rev = 0;
        while(n>0){
            int temp = n%10;
            rev = rev*10+temp;
            n = n/10;
         }
        return rev;

    }
    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n% 2 == 0) return false;
        for(int i=3; i*i <= n; i += 2){
            if(n%i == 0) return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int sum = 0;
        int r = reverse(n);
        int min = Math.min(n,r);
        int max = Math.max(n,r);
        for(int i = min;i<=max;i++){
            if(isPrime(i)){
                sum = sum+i;
            }
        }
        return sum;
    }
}