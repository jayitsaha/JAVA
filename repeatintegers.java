class Solution {
    public boolean canDistribute(int[] nums, int[] quantity) {
        // compress the states first
        int[] counts = new int[1001];
        int n = 0;
        for(int i: nums) {
            counts[i] ++;
            if (counts[i] == 1) {
                n++;
            }
        }
        
        nums = new int[n];
        int j = 0;
        for(int i: counts) {
            if (i > 0) {
                nums[j++] = i;
            }
        }
        
        int m = quantity.length;
        int[] distrib = new int[m];
        Arrays.fill(distrib, -1);
        
        return distribute(nums, distrib, quantity, 0);
    }
    
    boolean distribute(int[] nums, int[] distrib, int[] quantity, int i) {
        int m = quantity.length;
        if (i == m) return true;
        
        int n = nums.length;
        int q = quantity[i];
        Set<Integer> used = new HashSet<>();
        for(int j = 0; j < n; j++) {
            int k = nums[j];
            if (k < q || used.contains(k)) continue;
            nums[j] -= q;
            distrib[i] = j;
            used.add(k); // Avoid duplicates. TLE without it.
            if (distribute(nums, distrib, quantity, i+1)) return true;
            nums[j] += q;
        }
        
        distrib[i] = -1;
        return false;
    }
}
