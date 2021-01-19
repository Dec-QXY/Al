package com.company.lanqiao;

/**
 * @author decqxy
 * 问题描述
 *
 * 　　小明要用二进制来表示 1 到 10000 的所有整数，要求不同的整数用不同的二进制数表示，请问，为了表示 1 到 10000 的所有整数，至少需要多少个二进制位？
 *
 * 答案提交
 *
 * 　　这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 * 答案为：14
 */
public class Test02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            String temp = Integer.toBinaryString(i);
            System.out.println(temp);
        }
    }
}
