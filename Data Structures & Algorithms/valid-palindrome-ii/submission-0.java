class Solution {
    public boolean validPalindrome(String s) {
        
        if(isPalindrome(s)){
            return true;
        }else{
                for(int i = 0; i<s.length(); i++){
                    String t = s.substring(0,i) + s.substring(i+1);
                    if(isPalindrome(t)){
                        return true;
                    }
                }
            
        }
        return false;

        
    }



    public boolean isPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char c[] = s.toCharArray();
        int r = c.length-1;
        int l = 0;
        
        while(l<r){
           if(c[l] != c[r]){
             return false;
           }
            l++;
            r--;
        }
        return true;
        
    }
}