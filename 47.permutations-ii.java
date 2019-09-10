/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        if(nums==null || nums.length==0)
            return null;
        List<Integer> tmp = new ArrayList<>();
        int[] visited = new int[nums.length];
        permuteHelper(res, tmp, visited, nums);
        return new ArrayList<>(res);
    }
    public void permuteHelper(Set<List<Integer>> res, List<Integer> tmp, int[] visited, int[] nums) {
        if(tmp.size()==nums.length){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==1)
                continue;
            tmp.add(nums[i]);
            visited[i] = 1;
            permuteHelper(res, tmp, visited, nums);
            tmp.remove(tmp.size()-1);
            visited[i] = 0;
        }
    }
}

