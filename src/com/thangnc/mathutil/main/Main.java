/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.thangnc.mathutil.main;

import com.thangnc.mathutil.core.MathUtil;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long expected = 120;
        int n=5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5!"+ expected);
        System.out.println("5!"+ actual);
        
    }
    
}
