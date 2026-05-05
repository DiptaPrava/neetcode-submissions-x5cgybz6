class Solution {
    public boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char c[] = s.toCharArray();
        int left = 0;
        int right = c.length-1;

        while(left<right){
           if(c[left] != c[right]){
                return false;
           }
            left++;
            right--;
        } 
   return true;
}
}