package com.hugus.oo.inhance.interfaceDemo;

public interface InterfaceDemo {

    static void main(String[] args) {
        System.out.println("JDK8开始可以添加静态方法");
    }

    default void useDefault(){
        System.out.println("JDK8开始 接口可以定义默认方法 是可以定义具体方法体的");
    }
}
