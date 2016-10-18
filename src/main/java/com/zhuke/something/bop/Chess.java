package com.zhuke.something.bop;

import org.testng.annotations.Test;

/**
 * 题1.2 象棋将帅问题
 * Created by ZHUKE on 2016/9/18.
 */
public class Chess {

    @Test
    //普通解法，时间复杂度，n*n
    //遍历A位置
    //-    遍历B位置
    //-        判断AB位置合法性
    //-            如合法，则输出
    //使用两个3*3的byte数组存储位置信息
    public void resolve1() {
        byte[][] locathion_a = new byte[3][3];
        byte[][] locathion_b = new byte[3][3];
        for (int i = 0; i < locathion_a.length; i++) {
            for (int j = 0; j < locathion_a[i].length; j++) {
                locathion_a[i][j] = 1;
                for (int m = 0; m < locathion_b.length; m++) {
                    for (int n = 0; n < locathion_b[m].length; n++) {
                        locathion_b[m][n] = 1;
                        if (j != n) {
                            System.out.println("A=" + (i * 3 + j + 1) + ", B=" + (m * 3 + n + 1));
                        }
                    }
                }
            }
        }
    }

    @Test
    public void resolve2() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i % 3 != j % 3)
                    System.out.println("A=" + i + ", B=" + j);
            }
        }
    }
}
