class Solution {
    public int searchInsert(int[] nums, int target) {
        int flag = 1;
        int a = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if (target == nums[i])
            {
                return i;
            }
            else 
            {
                flag = 0;
            }
        }
        if (flag == 0)
        {
            int [] newarray = new int [nums.length + 1];
            for(int i = 0, j = 0; i < nums.length; i++,j++)
            {
                newarray[j] = nums[i];
            }
            newarray[nums.length] = target;
            Arrays.sort(newarray);

            for(int i = 0; i<newarray.length; i++)
        {
            if (target == newarray[i])
            {
                 a = i;
            }
        }


        } 
        return a; 
             
    }

}
