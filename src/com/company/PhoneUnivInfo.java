package com.company;

/**
 * Created by Byunghun on 2017-08-02.
 */
public class PhoneUnivInfo extends PhoneInfo{
    String major;
    int year;

    public PhoneUnivInfo(String name, String phoneNumber, String majorName, int year) {
        super(name, phoneNumber);
        this.major = majorName;
        this.year = year;
    }
    public void showPhoneInfo()
    {
        super.showPhoneInfo();
        System.out.println("전공: " + major);
        System.out.println("학년: " + year);
    }
}
