package com.blb;

/**
 * @author 仇斌
 * @date 2021/7/18 0018 12:24
 */
public  class TransferTest1 {
    public void swap(int a, int b) {
        int tmp = a; a = b; b = tmp;
        System.out.println("swap方法里，a的值是" + a + "；b的值是" + b);
    }
    public static void main(String[] args) {
        TransferTest1 test = new TransferTest1();
        int a = 5;
        int b = 10;
        test.swap(a, b);
        System.out.println("交换结束后，变量a的值是" + a + "；变量b的值是" + b);
//        int a=1;
//        Integer integer = new Integer(a);
//        System.out.println(integer);
//        float b=(float)a;
//        System.out.println(a);
//        System.out.println(integer);
//        System.out.println(b);

    }
}
