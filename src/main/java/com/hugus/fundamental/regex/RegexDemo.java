package com.hugus.fundamental.regex;

public class RegexDemo {
    public static void main(String[] args) {
        //匹配任意字符
        String reg1 = ".";
        String str1 = "}";
        System.out.println(str1.matches(reg1));

        //匹配多个字符
        String reg2 = "[\\dQWERD]*";
        String reg3 = "[0-5QWERD]";
        String str2 = "454592R";
        System.out.println(str2.matches(reg2));
        System.out.println(str2.matches(reg3));

        //取非匹配
        String reg4 = "^(52698)";
        System.out.println("7".matches(reg4));



    }
}
