class Solution {
    public int maxArea(int[] height) {
        
        // int ans = 0;
        // for(int i =0;i<height.length; i++){
        //     for(int j =1; j<height.length; j++){
        //         int val = Math.min(height[i],height[j]) * (j-i);
        //         ans = Math.max(ans,val);
        //     }
        // }

        // return ans;

        int pt1 = 0;
        int pt2 = height.length-1;
        int ans  = 0;

        while(pt2 > pt1){
            ans = Math.max(Math.min(height[pt1],height[pt2]) * (pt2 - pt1),ans);

            if(height[pt2] >= height[pt1]){
                pt1++;
            }else{
                pt2--;
            }
        }

        return ans;

    }
}