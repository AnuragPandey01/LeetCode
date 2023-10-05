class Solution {

    boolean flag = false;
    public int[] searchRange(int[] nums, int target) {

        int[] ans = new int[2];

        int ciel = find_ciel(nums,target);
        int floor = find_floor(nums,target);
        
        
        if(flag){
            ans[0] = floor;
            ans[1] = ciel;
        }else{
            ans[0] = -1;
            ans[1] = -1;
        }

        return ans;
    }

    private int find_ciel(int[] nums,int target){

        int ans = nums.length;
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid] > target){
                ans = mid;
                high = mid-1;
            }
            if(nums[mid] < target){
                low = mid+1;
            }
            if(nums[mid] == target){
                flag = true;
                low =  mid+1;
            }
        }

        return ans-1;
    }

    private int find_floor(int[] nums,int target){

        int ans = -1;
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid] > target){
                high = mid-1;
            }
            if(nums[mid] < target){
                ans = mid;
                low = mid+1;
            }
            if(nums[mid] == target){
                flag = true;
                high =  mid-1;
            }
        }
        return ans+1;
    }


}