package com.company;

/**
 * Created by Byunghun on 2017-08-02.
 */
public class PhoneCompanyInfo extends PhoneInfo{
    String company;

    public PhoneCompanyInfo(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber);
        this.company = companyName;
    }
    public void showPhoneInfo()
    {
        super.showPhoneInfo();
        System.out.println("회사: " + company);
    }
}
