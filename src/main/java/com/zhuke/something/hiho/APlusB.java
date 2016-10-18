package com.zhuke.something.hiho;

import java.util.Scanner;

/**
 * Created by ZHUKE on 2016/9/12.
 */
public class APlusB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
