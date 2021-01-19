package com.company.lanqiao;

import java.util.Scanner;

/**
 * 问题描述
 * 　　小蓝有一张黑白图像，由 n * m 个像素组成，其中从上到下共 n 行，每行从左到右 m 列。每个像素由一个 0 到 255 之间的灰度值表示。
 * 　　现在，小蓝准备对图像进行模糊操作，操作的方法为：
 * 　　对于每个像素，将以它为中心 3 * 3 区域内的所有像素（可能是 9 个像素或少于 9 个像素）求和后除以这个范围内的像素个数（取下整），得到的值就是模糊后的结果。
 * 　　请注意每个像素都要用原图中的灰度值计算求和。
 * 输入格式
 * 　　输入的第一行包含两个整数 n, m。
 * 　　第 2 行到第 n + 1 行每行包含 m 个整数，表示每个像素的灰度值，相邻整数之间用一个空格分隔。
 * 输出格式
 * 　　输出 n 行，每行 m 个整数，相邻整数之间用空格分隔，表示模糊后的图像。
 * 样例输入
 * 3 4
 * 0 0 0 255
 * 0 0 255 0
 * 0 30 255 255
 * 样例输出
 * 0 42 85 127
 * 5 60 116 170
 * 7 90 132 191
 * 数据规模和约定
 * 　　对于所有评测用例，1 <= n, m <= 100。
 */

public class Test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] img = new int[n][m];

        int[][] newImg = new int[n][m];
        // 构造图
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                img[i][j] = scanner.nextInt();
            }
        }

        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = 0;
                int count = 0;
                for (int k = 0; k < 9; k++) {
                    int a = (i - 1) + k / 3;
                    int b = (j - 1) + k % 3;
                    if (a >= 0 && b >= 0 && a < n && b < m) {
                        sum += img[a][b];
                        count++;
                    }
                }
                newImg[i][j] = sum / count;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(newImg[i][j] + " ");
            }
            System.out.println();
        }


    }
}
