class Solution {
    public int coinChange(int[] coins, int amount) {
        int arr[] = new int[amount + 1];
        Arrays.fill(arr, -1);
        int ans = func(coins, amount, arr);
        if(ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
    public int func(int coins[], int amount, int arr[])
    {
        if(amount == 0)
            return 0;
        if(arr[amount] != -1)
            return arr[amount];
        int ans = Integer.MAX_VALUE;
        for(int coin : coins)
        {
            if(coin <= amount)
            {
                int res = func(coins, amount - coin, arr);
                if(res != Integer.MAX_VALUE)
                    ans = Math.min(ans, 1 + res);
            }
        }
        arr[amount] = ans;
        return arr[amount];
    }
}