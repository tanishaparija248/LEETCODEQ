class Solution {
    public int compress(char[] chars) {
    int write = 0, read = 0;
    while (read < chars.length) {
        int start = read;
        while (read < chars.length && chars[read] == chars[start])
            read++;
        int count = read - start;
        chars[write++] = chars[start];   
        if (count > 1) {
            int l = write;
            while (count > 0) {
                chars[write++] = (char) ('0' + count % 10);
                count /= 10;
            }
            int r = write - 1;
            while (l < r) {
                char tmp = chars[l]; chars[l] = chars[r]; chars[r] = tmp;
                l++; r--;
            }
        }
    }
    return write;
    }
}