/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thangnc.mathutil.test.core;

import com.thangnc.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        long expected = 1;
        int n = 10;
        long actual = MathUtil.getFactorial(n);

        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));

    }
//    Bị lỗi - Do expected sai
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//        MathUtil.getFactorial(-5);
//    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
    
        @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_Lambda() {
//       Assert.assertThrows(tham số 1: ngoại lệ muốn so sánh,
  //                        tham số 2: đoạn code chạy văng ra ngoài)
          Assert.assertThrows(IllegalArgumentException.class,
                  () -> MathUtil.getFactorial(-5));
  
    }

    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            Assert.assertEquals("Invalid argument. N must be between 0..20", e.getMessage());
        }
    }

    //cách khác để bắt ngoại lệ
}
