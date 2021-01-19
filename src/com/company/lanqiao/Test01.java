package com.company.lanqiao;

/**
 * @author decqxy
 * 问题描述
 *
 * 　　请问在 1 到 2020 中，有多少个数既是 4 的整数倍，又是 6 的整数倍。
 *
 * 答案提交
 *
 * 　　这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 * 答案为：168
 */


public class Test01 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2020; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
