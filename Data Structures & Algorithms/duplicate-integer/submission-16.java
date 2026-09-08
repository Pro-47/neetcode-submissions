class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if (i<nums.length - 1 && nums[i]==nums[i+1]){
                return true;
            }
        }

        /*Hashtable<Integer, Integer> tab = new Hashtable<>();
        for (int i=0; i<nums.length; i++){
            if(!tab.containsKey(nums[i])){
                tab.put(nums[i],1);
            } else {
                return true;
            }
        }*/
        return false;
    }
}