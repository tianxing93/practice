package com.xing;

import java.util.*;

public class lambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","a","d");
        list.forEach(s -> System.out.println(s));

        System.out.println("-----------map的演示------------");
        Map<String,String> map = new HashMap<>();//diamon语法(钻石或菱形语法)

        map.put("a","A");
        map.put("b","B");
        map.put("c","C");
        map.put("d","D");

        Set<String> keySet = map.keySet();
        for(String string:keySet){
            System.out.println(string + "::" +map.get(string));
        }

        System.out.println("----------通过lambda表达式的方式来执行--------------");

        map.forEach((key,value) -> System.out.println(key + "::" + value));

        System.out.println("------------通过lambda表达式的方式遍历复杂集合------------");
        Map<String,List<String>> map1 = new HashMap<>();
        List<String> l1 = Arrays.asList("1","2");
        List<String> l2 = Arrays.asList("XX","BB");

        map1.put("VV",l1);
        map1.put("OO",l2);

        map1.forEach((key,value) -> {
            System.out.println(key);
            value.forEach(v -> System.out.println(v));
        });
    }
}
