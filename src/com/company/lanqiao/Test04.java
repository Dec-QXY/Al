package com.company.lanqiao;

/**
 * @author decqxy
 * 问题描述
 *
 * 　　一个无向图包含 2020 条边，如果图中没有自环和重边，请问最少包含多少个结点？
 *
 * 答案提交
 *
 * 　　这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 * 答案：
 */
public class Test04 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2019 ; i++) {
            count += i;
            if (count>=2020) {
                System.out.println(i);
                break;
            }
        }

        int sum64 = 0;
        for (int i = 1; i <= 64; i++) {
            sum64 += i;
        }
        System.out.println(sum64);

        int sum63 = 0;
        for (int i = 1; i <= 63; i++) {
            sum63 += i;
        }
        System.out.println(sum63);

        int sum62 = 0;
        for (int i = 1; i <=62; i++) {
            sum62 += i;
        }
        System.out.println(sum62);
    }
}
