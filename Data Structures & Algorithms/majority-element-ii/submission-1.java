class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            // if(map.containsKey(x)){
            //     map.put(x,map.get(x)+1);
            // }else{
            //     map.put(x,1);
            // }
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : map.keySet()){
            if(map.get(num)>n/3){
                list.add(num);
            }
        }
        return list;

    }
}