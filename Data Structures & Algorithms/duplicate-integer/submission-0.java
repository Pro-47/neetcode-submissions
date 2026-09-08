class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();
        for(int num: nums){
            if (!duplicate.add(num)){
                return true;
            }
        }
        return false;
    }
}