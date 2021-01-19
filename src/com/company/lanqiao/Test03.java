package com.company.lanqiao;

/**
 * @author decqxy
 * 问题描述
 *
 * 　　请问有多少个序列满足下面的条件：
 * 　　1. 序列的长度为 5。
 * 　　2. 序列中的每个数都是 1 到 10 之间的整数。
 * 　　3. 序列中后面的数大于等于前面的数。
 *
 * 答案提交
 *
 * 　　这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 * 答案为：2002
 */
public class Test03 {
    public static void main(String[] args) {
        // 通过暴力的方式来解决
        // 计数
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                for (int k = 1; k <= 10; k++) {
                    for (int l = 1; l <= 10; l++) {
                        for (int m = 1; m <= 10; m++) {
                            if (i <= j && j <= k && k <= l && l <= m) {
                                System.out.println(i + " " + j + " " + k + " " + l + " " + m);
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("count:" + count);
    }
}
