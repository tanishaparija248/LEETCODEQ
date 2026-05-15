class Solution {
    public String reverseWords(String s) {
         String[] arr = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length - 1; i >= 0; i--) {

            if(!arr[i].equals("")) {
                sb.append(arr[i]).append(" ");
            }
        }

        return sb.toString().trim();
        
    }
}