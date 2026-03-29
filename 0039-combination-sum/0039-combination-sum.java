class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer> temp,int[] nums,int target,int start){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(result,temp,nums,target-nums[i],i);
            temp.remove(temp.size()-1);
        }
    
    }
    }
