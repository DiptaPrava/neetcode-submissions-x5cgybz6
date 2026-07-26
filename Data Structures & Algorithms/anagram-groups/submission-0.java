class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            
             int count[] = new int[26];
             String s = strs[i];
             char c[] = s.toCharArray();
             for(int j = 0; j<c.length; j++){
                count[c[j] - 'a']++;
             }
            
          
            
            String key = Arrays.toString(count);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
