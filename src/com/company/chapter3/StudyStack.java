package com.company.chapter3;

/**
 * @author decqxy
 */
public class StudyStack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public StudyStack(int s) {
        // 初始化栈
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int j) {
        if (isFull()) {
            System.out.println("isFull " + j);
            return;
        }
        stackArray[++top] = j;
    }

    public long pop() {
        if (isEmpty()) {
            return -1;
        }
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        StudyStack stack = new StudyStack(10);
        for (int i = 1; i <= stack.maxSize; i++) {
            stack.push(i);
        }
        System.out.println("输出的栈顺序为：");
        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
    }
}
