class Solution {
    public int findMaxK(int[] nums) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxK = -1;

        for (int num : nums) {
            if (num > 0 && set.contains(-num)) {
                maxK = Math.max(maxK, num);
            }
        }

        return maxK;
    }
}
