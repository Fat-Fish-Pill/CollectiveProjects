package com.git;

public class Test {
    public static void main(String[] args) {
        User user=new User();
        user.setName("张三");
        user.setAge(15);
        System.out.println(user.toString());
    }
}
