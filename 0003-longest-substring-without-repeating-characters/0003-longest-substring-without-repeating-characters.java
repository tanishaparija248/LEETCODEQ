class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,count=0;
        HashSet<Character> set=new HashSet<>();
        char arr[]=s.toCharArray();
        for(int right=0;right<arr.length;right++)
        {
        while(set.contains(arr[right]))
        {
            set.remove(arr[left]);
            left++;
        }
        set.add(arr[right]);
        count=Math.max(count,right-left+1);
        }
        return count;
    }
}