class Solution {
public:
    int paintWalls(vector<int>& cost, vector<int>& time) {
        int n = cost.size();
        vector<vector<int>> cache(n, vector<int>(2 * n + 1, -1));
        function<int(int, int)> dp = [&](int i, int t) -> int {
            if (i == n) return (t >= 0) ? 0 : 1e9;
            if (cache[i][t + n] != -1) return cache[i][t + n];
            return cache[i][t + n] = min(dp(i + 1, t - 1), 
                                cost[i] + dp(i + 1, min(t + time[i], n)));
        };
        return dp(0, 0);
    }
};
