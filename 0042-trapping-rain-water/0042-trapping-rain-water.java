class Solution {
    public int trap(int[] height) {
        int count = 0;

        int i = 0;
        while (i < height.length - 1) {
            int j = i + 1;
            int internal = 0;
            int maxRight = 0;
            int maxRightIndex = -1;
            while (j < height.length) {
                if (height[j] >= height[i]) {
                    count += (Math.min(height[i],height[j]) *(j - i -1)) - internal;
                    i = j;
                    break;
                }

                internal += height[j];

                if (height[j] > maxRight) {
                    maxRight = height[j];
                    maxRightIndex = j;
                }

                j++;
            }

            if (j == height.length && maxRightIndex != -1) {
                internal = 0;
                for (int k = i + 1; k < maxRightIndex; k++) {
                    internal += height[k];
                }

                count += (Math.min(height[i],height[maxRightIndex]) *(maxRightIndex - i -1)) - internal;
                i = maxRightIndex;
            }

            if (j == height.length && maxRightIndex == -1) break;
        }

        return count;
    }
}
