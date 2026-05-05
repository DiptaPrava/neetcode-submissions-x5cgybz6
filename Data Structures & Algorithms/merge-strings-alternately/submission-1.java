class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        // char c[] = word1.toCharArray();
        // char d[] = word2.toCharArray();

        // int minlength = Math.min(c.length,d.length);
        // char merge[] = new char[c.length + d.length];
        // int index = 0;
        // for(int i = 0; i<minlength; i++){
        //     merge[index++] = c[i];
        //     merge[index++] = d[i];
        // }

        // if(c.length < d.length){
        //     for(int i = minlength; i<d.length; i++){
        //         merge[index++] = d[i];
        //     }
        // }else if(c.length > d.length){
        //      for(int i = minlength; i<c.length; i++){
        //         merge[index++] = c[i];
        //      }
        // }  

        
        // String newC = String.valueOf(merge);
        // return newC;

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;

        while(i<word1.length() && j<word2.length()){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }

        while(i<word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();



















    }
}