package com.hugus.fundamental.Arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        /*
        数组的声明和初始化
        以及查询数组元素
         */
        int[][] nums = new int[][]{
                {0,1,2},{3,4,5},{6,7,8}
        };

        for (int[] num:
                nums) {
            for (int n:
                 num) {
                System.out.println(n);
            }
        }

        String[] strings = new String[]{"k","G","p","d","e",};
        for (String str:
             strings) {
            System.out.println(strings);
        }

         /*
        数组的复制
        Arrays.copyOf多数用于数组的扩容啦
        如果是想要复制数组内容 也可以使用System.arraycopy
         */
        String[] newString = Arrays.copyOf(strings, 10);
        System.out.println(newString.length);
        for (String s:
             newString) {
            System.out.println(s);
        }
        String[] newString2 = new String[7];
        System.arraycopy(strings, 0, newString2, 2, 4);
        System.out.println("newString2 is:");
        System.out.print("[");
        for (String s:newString2
             ) {
            System.out.print(s);
        }
        System.out.print("]");

        Arrays.sort(strings);
        System.out.println("strings is:");
        System.out.print("[");
        for (String s:strings
        ) {
            System.out.print(s);
        }
        System.out.println("");


        int[] array = {18,55,96,5,3,10,23,88,76,49,62,11};
        bubbleSort(array);
        System.out.print("sorted:{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.print("}");
    }
    /*
    其原理就是两两比较 然后把较大的那个数往后放
    第一轮最后一个数一定是最大的 然后开始排除最后一个数的第二轮
    第二轮最后两个数一定是最大的..
    如此往复
     */
    private static int[] bubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

}
