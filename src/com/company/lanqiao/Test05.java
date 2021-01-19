package com.company.lanqiao;

public class Test05 {
    public static void main(String[] args) {
        char[] arr = "LANQIAO".toCharArray();

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                count += Math.abs(arr[i] - arr[j]);
            }
        }
        System.out.println(count);
    }
}
