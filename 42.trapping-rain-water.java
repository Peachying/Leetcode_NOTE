/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */
class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0)
            return 0;
        int max = 0, res = 0;
        int[] maxArr = new int[height.length];
        for(int i=0;i<height.length;i++){
            max = Math.max(max, height[i]);
            maxArr[i] = max;
        }
        max = 0;
        for(int i=height.length-2;i>=0;i--){
            max = Math.max(max, height[i+1]);
            int min = Math.min(max, maxArr[i]);
            if(height[i]<min)
            res += min - height[i];
        }
        return res;
    }
}

