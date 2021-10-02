class Solution {
    public boolean isThree(int n) {
        int g = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) g++;
            if (g > 3) return false;
        }
        return g == 3;
    }
}
