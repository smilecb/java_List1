package com.blb.com.string;

import java.util.Locale;

public class Demo1 {
    public static void main(String[] args) {
       String s="abcdefg";
        System.out.println(s.length());//长度
        System.out.println(s.charAt(2));//某处的字符
        String s1 = s.toLowerCase();//小写
        System.out.println(s1);
        String s2 = s1.toUpperCase();//大小
        System.out.println(s2);
        String a="  hello word ";
        System.out.println(a);
        System.out.println(a.trim());//去首位空格
        String concat = a.concat(s);//连接
        System.out.println(concat);
        String s4="abcd";
        String s5="abeg";
        System.out.println(s4.compareTo(s5));//比较大小  排序可以用
        String substring = s.substring(1);
        System.out.println(substring);//子串
        String substring1 = s.substring(1, 5);
        System.out.println(substring1);//子串
        System.out.println("======================================");
        System.out.println(s.startsWith("a"));//字符串s是否以字符串a开始
        System.out.println(s.endsWith("g"));//字符串s以字符串g结尾
        System.out.println(s.concat("abc"));//字符串s是否包含abc
        String t="aaaaaaaaaaaa";
        System.out.println(t.indexOf("a"));//字符串t中a出现的索引
        System.out.println(t.indexOf("b"));
        System.out.println(t.lastIndexOf("a"));//字符串t中a最后一次出现的索引
        System.out.println("==========================");
        String str="abcabc";
        String replace = str.replace('a', 'X');
        System.out.println(replace);
        String replace1 = str.replace("ab", "X");
        System.out.println(replace1);
        String s3 = str.replaceFirst("ab", "X");
        System.out.println(s3);
        String[] as = str.split("a");//str字符串中用字符串a进行分隔
        System.out.println(as.length);
        for(String ass:as)
        {
            System.out.println(ass);
        }
    }
}
