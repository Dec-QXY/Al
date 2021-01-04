package com.company.study01;

/**
 * @author decqxy
 */
public class Demo01 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 23, 42, 11, 32, 23};
        // 便利前的顺序为
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        // 直接插入排序
        // binSort(arr);
        // 冒泡排序
        // bubbleSort(arr);
        // 选择排序
        selectSort(arr);
        // 结果输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 直接插入排序
     * @param arr
     */
    public static void insertSot(int[] arr) {
        int j;
        for (int i = 2; i < arr.length; i++) {
            // 初始化第一位的数字,将第三个数字放在第一位
            arr[0] = arr[i];
            // 使用j来表示比i小一位的位置的数字是否大于初始化的数字
            j = i - 1;
            // 循环比较数字
            while (arr[0] < arr[j]) {
                // 如果后一位较大，就将前一位放在后一位上，依次便利后移
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = arr[0];
        }
    }

    /**
     * 二分法插入排序
     * @param arr
     */
    public static void binSort(int[] arr) {
        // 定义
        int low, high, mid;
        // 控制每一堂比较的数字
        for (int i = 2; i < arr.length; i++) {
            // 初始化0位置上为下一次排序比较的元素
            arr[0] = arr[i];
            low = 1;
            high = i - 1;
            // 循环遍历较大的放在前面，小的放在后面拆入其中
            while (low <= high) {
                mid = (low + high) / 2;
                if (arr[low] < arr[mid]) {
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }
            // 循环调整部分排序后的数字，主要是使有序的部分后移
            for (int j = i -1; j >= low; j--) {
                arr[j + 1] = arr[j];
            }
            // 将这个数字放回合适的位置
            arr[low] = arr[0];
        }
    }

    /**
     * 改进后的冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        // 插旗子法，定义一个量来判断是否需要执行下一步
        int flag = 1, temp;
        // 遍历控制外循环,如果flag为1就执行循环，目的是为了让该程序知道提前结束
        for (int i = 1; i < arr.length && flag == 1; i++) {
            // 进入程序设置flag = 0
            flag = 0;
            // 遍历每一趟的数字大小，结束位置为总长度减去i目前的位置再减去1
            for (int j = 1; j < arr.length - i - 1; j++) {
                // 判断前一个数字是否较大，如果较大就执行交换的操作
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = 1;
                }
            }
        }
    }

    /**
     * 选择排序算法
     * @param arr
     */
    public static void selectSort(int[] arr) {
        int temp, num;
        // 外循环控制，
        for (int i = 1; i < arr.length; i++) {
            // 将i上的数字进行初始化，将下标赋值给num
            num = i;
            // 比较第i后以为数字，知道出现较小的放在最前面并且交换数字的位置
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[num]) {
                    num = j;
                }
                // 当比较出较小的位置比最开始初始化的位置小的时候就进行交换，知道整个数组遍历结束。
                if (num != i) {
                    temp = arr[i];
                    arr[i] = arr[num];
                    arr[num] = temp;
                }
            }
        }
    }
}