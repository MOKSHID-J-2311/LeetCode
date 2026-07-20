class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '6') return (int) (num + ((Math.pow(10, s.length() - 1 - i)) * 3));
        return num;
    }
} 