class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()){
            return false;
        }

        char[] arr = s.toCharArray();
        char[] arrr = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arrr);

        return Arrays.equals(arr, arrr);
    }
   
   
}
