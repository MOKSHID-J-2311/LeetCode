class Solution {
    public int reverse(int x) {
        int ans=0;
        while(x!=0){
            int t=x%10;
              if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) {
                return 0;
            }
             ans=ans*10+t;
         x=x/10;
        }
        return ans;
    }
     public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
    int ret = new Solution().reverse(a);
    }
}