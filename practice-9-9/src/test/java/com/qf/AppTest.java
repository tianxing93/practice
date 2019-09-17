package com.qf;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Scanner;


public class AppTest 
{

    @Test
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入整数N:");
        int n = scan.nextInt();
        int sum = 0;
        String msg = "";
        for (int i = 1; i <= n ; i++) {
            int k = i;
            if(i%2 == 0){
                k = -k;
            }
            sum += k;
            if(k > 1){
                msg = msg + "+" +k;

            }else{
                msg = msg + k;
            }
        }
        System.out.println(msg + "=" +sum);
    }
}
