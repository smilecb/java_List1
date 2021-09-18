package com.blb.com;

/**
 * @author 仇斌
 * @date 2021/7/12 0012 22:58
 */
public class demo4 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
