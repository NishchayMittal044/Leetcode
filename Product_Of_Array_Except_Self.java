class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] answer = new int [nums.length];
        // for(int i = 0; i< nums.length; i++)
        // {
        //     answer[i] = 1;
        // }
        // for(int i = 0; i <nums.length; i++)
        // {
        //    for(int j = 0;j<nums.length;j++) 
        //    {
        //      if(i != j)
        //      {
        //         answer[i] = answer[i] * nums[j];
        //      }
        //    }
        // }
       
        int [] aage = new int  [nums.length];
        aage[0] = 1;
        for(int i = 1; i<nums.length ; i++)
        {
            aage[i] = aage[i-1]*nums[i-1];
        }

        int [] peeche = new int  [nums.length];
        peeche[nums.length - 1] = 1;
        for(int i = nums.length-2; i>=0 ; i--)
        {
            peeche[i] = peeche[i+1]*nums[i+1];
        }

        for(int i = 0; i < nums.length; i++)
        {
            answer[i] = aage[i] * peeche[i];
        }



        return answer;
    }
}
