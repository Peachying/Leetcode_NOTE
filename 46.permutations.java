/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        int[] visited = new int[nums.length];
        if(nums==null || nums.length==0)
            return res;
        permuteHelper(nums, res, tmp, visited);
        return res;
    }

    public void permuteHelper(int[] nums, List<List<Integer>> res, List<Integer> tmp, int[] visited) {
        if(tmp.size() == nums.length){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==0){
                tmp.add(nums[i]);
                visited[i] = 1;
                permuteHelper(nums, res, tmp, visited);
                tmp.remove(tmp.size()-1);
                visited[i] = 0;
            }
        }
        
    }
}

