class Solution {
      public int missingNumber(int[] nums) 
      {
        /*
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != i)
            {
                return i;
            }
        }
        return nums.length;
        */

        boolean[] seen = new boolean[nums.length + 1];
        for(int x : nums)
        {
             seen[x]=true;
        }
        for(int i=0;i<seen.length;i++)
        {
            if(!seen[i])
            {
                return i;
            }
        }
        return -1;
    }
}
