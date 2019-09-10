/*
 * @lc app=leetcode id=407 lang=java
 *
 * [407] Trapping Rain Water II
 */
class Solution {
    
    public int trapRainWater(int[][] heightMap) {
        if(heightMap==null || heightMap.length==0)
            return 0;
        int row = heightMap.length - 1, col = heightMap[0].length - 1;
        int res = 0;
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                int left=0, right=0, up=0, down=0;
                for(int l=0;l<j;l++)
                    left = Math.max(left, heightMap[i][l]);
                for(int l=j+1;l<=col;l++)
                    right = Math.max(right, heightMap[i][l]);
                for(int l=0;l<i;l++)
                    up = Math.max(up, heightMap[l][j]);
                for(int l=i+1;l<=row;l++)
                    down = Math.max(down, heightMap[l][j]);
                int min = Math.min(Math.min(left, right), Math.min(up, down));
                if(min>heightMap[i][j])
                    res += min - heightMap[i][j];
            }
        }
        return res;
    }

    
}

