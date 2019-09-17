package com.qf;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AppTest 
{

    @Test
    public void test() {
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

    @Test
    public  void test1(){
        List<String> list = new ArrayList<>();
        for(char i = 'A';i <= 'F' ;i++){
            list.add(""+i);
        }
        System.out.println("六个人的编号为：");
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("中奖者为：");
        for(int k = 0;k < 3;k++){
            int d = (int)(Math.random()*(6-k));
            System.out.print(list.remove(d)+" ");
        }
    }
}
