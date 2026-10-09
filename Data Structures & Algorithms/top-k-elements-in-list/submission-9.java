class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> intCount = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<>();
        for (int n: nums) {
            if (intCount.putIfAbsent(n, 0) != null) {
                intCount.replace(n, intCount.get(n) + 1);
            }
        }
        result = intCount.entrySet().stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
        return Arrays.copyOfRange(
            result.stream().mapToInt(Integer::intValue).toArray(), 0 , k);
    }
}
