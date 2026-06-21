class Solution {
    public String addBinary(String a, String b) {
        int padding = Math.abs(a.length()- b.length());
        char[] pad = new char[padding];
        Arrays.fill(pad, '0');
        String padString = new String(pad);
       
        int carry = 0;
        String add = new String();
       
        if(a.length()<b.length()){
            a = padString + a;
        }else{
            b = padString + b;
        }
       
        for(int i = a.length(); i>0; i--){
            int first = a.charAt(i-1) - '0';
            int second = b.charAt(i-1) - '0';
            int sum = first + second + carry;
            carry = 0;
            if (sum == 2){
                carry = 1;
                sum = 0;
            }else if(sum == 3){
                carry = 1;
                sum = 1;
            }
            add = sum + add;
        }
        if(carry == 1){
            add = "1" + add;
        }
        return add;
    }
}

    