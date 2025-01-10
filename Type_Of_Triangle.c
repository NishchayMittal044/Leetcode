char* triangleType(int* nums, int numsSize) {
    int flag = 0;
    if((nums[0]+nums[1]>nums[2])&&(nums[1]+nums[2]>nums[0])&&(nums[0]+nums[2]>nums[1]))
    {
    flag = 1;
    }
    if(flag == 0)
    {
        return "none";
    }
    else if(nums[0] == nums[1] && nums[1]==nums[2])
    {
        return "equilateral";
    }
    else if((nums[0] != nums[1]) && (nums[1] != nums[2]) && (nums[0] != nums[2]) )
    {
        return "scalene";
    }
    else 
    {
        return "isosceles";
    }

    
}
