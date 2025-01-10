class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1=0,index2=0;
        for(int i = 0; i<nums.length;i++)
        {
            for(int j = 0; j<nums.length && j != i ;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    index1 = i;
                    index2 = j;
                }
            }
           
        }
        int [] ans= new int[2];
        ans[0] = index1;
        ans[1] = index2;
        return ans;
    }
}
