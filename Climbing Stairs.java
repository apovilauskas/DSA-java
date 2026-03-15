class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        ArrayList<Integer> memo = new ArrayList<>(Collections.nCopies(n+1,0));
        memo.set(1, 1);
        memo.set(2, 2);

        for(int i=3; i<=n; i++){
            memo.set(i, memo.get(i-1)+memo.get(i-2));
        }
        return memo.get(n);
    }
}
