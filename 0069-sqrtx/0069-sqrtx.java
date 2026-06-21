class Solution {
    public int mySqrt(int x) {
        if (x==0){
            return 0;
        }
        int prev = 1;
        for(double i = 1.0; i<x; i++){
            if(x/i < i){
                return prev;
            }else{
                prev = (int)i;
            }
        }
        return prev;
    }
}