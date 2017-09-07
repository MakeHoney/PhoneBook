package com.company;

/**
 * Created by Byunghun on 2017-07-10.
 */
public class PhoneInfo {
    String name;
    String phoneNumber;

    public PhoneInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void showPhoneInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("핸드폰번호: " + this.phoneNumber);
    }
}