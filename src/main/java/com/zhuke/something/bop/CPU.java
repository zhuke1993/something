package com.zhuke.something.bop;

import org.testng.annotations.Test;

/**
 * 题1.1  CPU占用率曲线
 * Created by ZHUKE on 2016/9/18.
 */
public class CPU {

    @Test
    public void testDeadLoop() throws InterruptedException {
        while (true) {
            for (long i = 0; i < 160000000; i++) {

            }
            Thread.sleep(10);
        }
    }

}
