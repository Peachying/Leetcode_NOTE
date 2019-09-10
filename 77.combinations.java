/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(n<=0 || k<=0)
            return res;
        List<Integer> tmp = new ArrayList<>();
        combineHelper(res, tmp, 1, n, k);
        return res;
    }
    public void combineHelper(List<List<Integer>> res, List<Integer> tmp, int cur, int n, int k) {
        if(k==0){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=cur;i<=n;i++){
            tmp.add(i);
            combineHelper(res, tmp, i+1, n, k-1);
            tmp.remove(tmp.size()-1);
        }
    }

   
	
}

