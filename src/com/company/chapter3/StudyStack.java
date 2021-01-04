package com.company.chapter3;

/**
 * @author decqxy
 */
public class StudyStack {

    public static void main(String[] args) {

    }
}

class StackJava {
    /**
     * 定义栈的大小
     */
    private int maxSize;

    private int[] data;

    private int top;



    public boolean ifFull() {
        return top == maxSize - 1;
    }
}
