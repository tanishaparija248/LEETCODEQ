class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcand=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
            maxcand=Math.max(maxcand,candies[i]);
        }
        List<Boolean> result=new ArrayList<>();
        for(int candy:candies)
        {
            if(candy+extraCandies>=maxcand)
            {
               result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}