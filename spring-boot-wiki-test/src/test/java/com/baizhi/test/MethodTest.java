package com.baizhi.test;

import org.junit.Test;

public class MethodTest {
    @Test
    public void print() {
        System.out.print("第一个：");
        for (int i = 1; i > -100; i += -2) {
            if (i % 3 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    @Test
    public void ring() {
        int a = 0;
        System.out.print("第二个；");
        do {
            a++;
            System.out.print(a + "\t");

        } while (a < 100);
        System.out.println();
    }

    @Test
    public void bone() {
        int a = 0;
        System.out.print("第三个；");
        while (a < 100) {
            a++;
            System.out.print(a + "\t");
        }
        System.out.println();
    }
}
