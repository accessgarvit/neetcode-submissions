class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> okay = new HashSet<>();

        for(int i = 0 ; i<nums.length;i++)
        {
            okay.add(nums[i]);
        }

        if(nums.length!=okay.size())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}