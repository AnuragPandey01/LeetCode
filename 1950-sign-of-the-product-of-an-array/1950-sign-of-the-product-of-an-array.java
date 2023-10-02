class Solution {
    public int arraySign(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(num<0){
                count++;
            }
            if(num == 0){
                count = -1;
                break;
            }
        }
        if(count == -1){
            return 0;
        } else if (count % 2 == 0) {
            return 1;
        }else{
            return -1;
        }
    }
}