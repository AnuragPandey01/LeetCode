class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        if(n < -1) return (n & n+1) == 0;
        return (n & n-1) == 0;
    }
}