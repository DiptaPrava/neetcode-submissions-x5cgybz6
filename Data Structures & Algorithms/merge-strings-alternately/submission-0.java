class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        char c[] = word1.toCharArray();
        char d[] = word2.toCharArray();

        int minlength = Math.min(c.length,d.length);
        char merge[] = new char[c.length + d.length];
        int index = 0;
        for(int i = 0; i<minlength; i++){
            merge[index++] = c[i];
            merge[index++] = d[i];
        }

        if(c.length < d.length){
            for(int i = minlength; i<d.length; i++){
                merge[index++] = d[i];
            }
        }else if(c.length > d.length){
             for(int i = minlength; i<c.length; i++){
                merge[index++] = c[i];
             }
        }  

        
        String newC = String.valueOf(merge);
        return newC;
    }
}