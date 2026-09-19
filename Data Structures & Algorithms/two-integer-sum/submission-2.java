class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> numList = Arrays.stream(nums).boxed().toList();
        for (int i =0; i<nums.length; i++){
            int index = numList.indexOf(target-nums[i]);
            if (numList.contains(target-nums[i]) 
            && index != i){
                return index > i ? new int[]{i, index} : new int[]{index, i};
            }
        }
        return null;
    }
}
