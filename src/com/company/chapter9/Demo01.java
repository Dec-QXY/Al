package com.company.chapter9;

/**
 * @author decqxy
 */
public class Demo01 {

    public static void main(String[] args) {
        int[] arr = {0 ,15, 18, 38, 6, 80, 32, 50, 75, 90};
        // 便利前的顺序为
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        // 直接插入排序
        // binSort(arr);
        // 冒泡排序
        bubbleSort(arr);
        // 选择排序
        // selectSort(arr);
        // 快速排序
        // quickSort(arr,1, arr.length - 1);
        // 结果输出
        for (int j : arr) {
            System.out.print(j + " ");
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
     * 折半插入排序
     * @param arr
     */
    public static void binSort(int[] arr) {
        int k, low, high, mid;
        for (int i = 2; i < arr.length; i++) {
            k = arr[i];
            low = 1;
            high = i - 1;
            while (low <= high) {
                mid = (low + high) / 2;
                if (k < arr[mid]) {
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }
            for (int j = i - 1; j >= low; --j) {
                arr[j + 1] = arr[j];
            }
            arr[low] = k;
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

    public static int quickSortPass(int[] arr, int low, int high) {
        int x;
        // 初始化数据,让x处于最低位的值
        x = arr[low];
        // 遍历数组
        while (low < high) {
            // 遍历数组，倒着寻找比x大的数字的部分，然后进行下表减的操作
            while (low < high && arr[high] > x) {
                high--;
            }

            if (low < high) {
               // 将小于x的值放在low位置上
                arr[low] = arr[high];
                low++;
            }

            while (low < high && arr[low] < x) {
                low++;
            }

            if (low < high) {
                // 将大于x的值放在high位置上
                arr[high] = arr[low];
                high--;
            }
        }
        // 将最开始初始化的值放在地位
        arr[low] = x;
        return low;
    }

    public static void quickSort(int[] arr, int low, int high) {
        // 当low<high的时候执行
        if (low < high) {
            int passNum = quickSortPass(arr, low, high);
            // 递归从低位部分开始比较
            quickSort(arr, low, passNum - 1);
            // 递归从高位部分边开始比较
            quickSort(arr, passNum + 1, high);
        }
    }


}
