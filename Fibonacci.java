public class Main {
    static void main() {
        System.out.println(iterative(32));
        System.out.println(recursive(32));//dynamic programming,same O(n) notation for space and time
    }

    public static int iterative(int n) {
        int back=2, back2 = 1, fib=-1;
        for(int i=3; i<n; i++){
            fib = back + back2;
            back2 = back;
            back = fib;
        }
        return fib;
    }

    public static int recursive(int n){
        ArrayList<Integer> memo = new ArrayList<>();
        for(int i=0; i<n+1; i++){
            memo.add(-1);
        }
        return recursiveHelper(n, memo);
    }

    public static int recursiveHelper(int n, ArrayList<Integer> memo){
        if(n <=1){
            return n;
        }
        if(memo.get(n)!=-1){
            return memo.get(n);
        }
        memo.set(n, recursiveHelper(n-2, memo)+recursiveHelper(n-1, memo));
        return memo.get(n);
    }
}
