class Solution {
    public boolean isPalindrome(int x) {
        int len = 0;
        int y = x;
        while (y>0){
            y = y/10;
            len++;
        }
        if (y < 0){
            return false;
        }

        int left, right = 0;
        for (int i = 0; i < len/2; i++) {
            left = (int) (x / Math.pow(10, len-i-1));
            left = left %10;
            right = (int) (x % Math.pow(10, i+1));
            right = (int) (right / Math.pow(10, i));
            if ( left != right) {
                return false;
            }
        }
        return true;
    }
}