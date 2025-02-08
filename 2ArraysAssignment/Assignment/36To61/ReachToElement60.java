public class ReachToElement60 {
    
        public static int minSteps(int N, int M) {
            if (N <= 0 || M <= 0) {
                return -1; // Invalid input
            }
    
            int[][] dp = new int[N + 1][M + 1];
    
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if (i == 1 && j == 1) {
                        dp[i][j] = 0; // Starting position
                    } else {
                        dp[i][j] = Math.min(dp[i][i + j], dp[i + j][j]) + 1;
                    }
                }
            }
    
            return dp[N][M];
        }
    
        public static void main(String[] args) {
            int N = 3;
            int M = 2;
            int result = minSteps(N, M);
            System.out.println("Minimum number of steps: " + result);
        }
    }
    