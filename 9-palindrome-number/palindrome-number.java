class Solution {
    public boolean isPalindrome(int a) {
        
        long x = a;
        if( x == 0){
            return true;
        } 

        if(x < 0){
            return false;
        }

        long y = 0;
        long pow = size(a)-1;
        long t = x;

        while(t != 0){
            y += t%10 * Math.pow(10,pow--);
            t = t/10;
        }

        return x==y;
         
    }

    public static int size(int n){
        int count = 0;
        while(n/10 != 0 || n%10!=0){
            count++;
            n = n/10;
        }
        return count;
    }
}