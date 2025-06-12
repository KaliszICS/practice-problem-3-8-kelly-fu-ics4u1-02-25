import java.util.HashMap;
import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {

	}


    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fib(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        if (memo.containsKey(num)) {
            return memo.get(num);
        }

        int result = fib(num - 1) + fib(num - 2);
        memo.put(num, result);
        return result;
    }





    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        if (n == 1) return cost[0]; // ← fix: only one step, must take it

        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 0;

        for (int i = 2; i <= n; i++) {
            int oneStep = memo[i - 1] + cost[i - 1];
            int twoStep = memo[i - 2] + cost[i - 2];
            memo[i] = Math.min(oneStep, twoStep);
        }

        return memo[n];
    }



	
}
