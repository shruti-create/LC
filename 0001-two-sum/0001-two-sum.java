class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> a = new HashMap<>();
        int[] rv = new int[2];
        for (int i = 0; i<nums.length; i++){
            a.put(nums[i], i);
        }
        for(int j = 0; j<nums.length; j++){
            if(a.containsKey(target-nums[j])){
                if(a.get(target-nums[j]) != j){
                    rv[0] = a.get(target-nums[j]);
                    rv[1] = j;
                    break;
                }
            }
        }
        return rv;
    }
}