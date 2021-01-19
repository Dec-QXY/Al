package com.company.lanqiao;

import java.util.Arrays;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = in.nextInt();
            }
        }
        int res = getMaxPath(map);
        System.out.println(res);
    }

    public static int getMaxPath(int[][] map) {
        int n = map.length;
        int m = map[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        dp[0][0] = map[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int step = 1; step <= 3; step++) {
                    // 三种状态到达该点 走1 2 3 步
                    for (int right = 0; right <= step; right++) {
                        int down = step - right;
                        int n_x = i - down;
                        int n_y = j - right;
                        if (isArea(n, m, n_x, n_y)) {
                            dp[i][j] = Math.max(dp[i][j], map[i][j] + dp[n_x][n_y]);
                        }
                    }
                }
            }
        }
        return dp[n - 1][m - 1];
    }

    public static boolean isArea(int row, int col, int x, int y) {
        return 0 <= x && x < row && y >= 0 && y < col;
    }

}
