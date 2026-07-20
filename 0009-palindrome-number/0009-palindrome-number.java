class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int a=x;
        int t;
        int s=0;
       while (x>0){
        t=x%10;
        s=s*10+t;
        x=x/10;
        }
        return a==s;
    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int z= sc.nextInt();
        boolean ret = new Solution().isPalindrome(z);
    }
}