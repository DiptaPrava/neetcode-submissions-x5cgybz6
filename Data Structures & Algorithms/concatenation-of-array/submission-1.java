class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n*2];
       

   
            for(int j = 0; j<nums.length; j++){
               ans[j] = nums[j];
               ans[j+n]= nums[j];
            }
       

        
        return ans;

    }
}