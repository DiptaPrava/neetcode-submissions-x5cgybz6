class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int a = nums[0];

        while(l<=r){
          

            if(nums[l]<nums[r]){
                a = Math.min(a,nums[l]);
                break;
            }
             int mid = l+(r-l)/2;

            a = Math.min(a,nums[mid]);

            if(nums[mid] >= nums[l]){
                l = mid+1;
            }
            else{
                r = mid -1;
            }
        }
        return a;
        
    }
}
