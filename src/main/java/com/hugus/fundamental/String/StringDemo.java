package com.hugus.fundamental.String;

public class StringDemo {
    public static void main(String[] args) {
        /*
        有关获取字符串信息的API
         */
        String str = "Hello HanMeiMei,I am LiLei.";
        int length = str.length();

        boolean isEmpty = str.isEmpty();

        boolean ifContain = str.contains("HanMeiMei");

        boolean valid = str.equals("hello HanMeiMei,I am LiLei.");

        boolean starts = str.startsWith("Han", 6);

        //String.format(Locale.US,"",str);

        int indexOfLi = str.indexOf("Ha");
        System.out.println(indexOfLi);

        int comp = str.compareTo("Hello Lilei");
        System.out.println(comp);

        String substring = str.substring(6);
        System.out.println(substring);

        String str2 = "AjjjsdOOSNN";
        boolean matches = str2.matches("^[A-Za-z]+$");
        System.out.println(matches);

        /*
        操作字符串
         */

        String concatStr = str.concat("what's your name?");
        System.out.println(concatStr);

        String joinStr = String.join("-", "HaHa", "XiXi", "DieDie");
        System.out.println(joinStr);

        String replaceStr = joinStr.replace("-", ",");
        System.out.println(replaceStr);

        String hexie = "我草,我日,你大爷的";
        String s = hexie.replaceAll("[草日大爷]", "*");
        System.out.println(s);

        String[] split = hexie.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        char[] chars = hexie.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
