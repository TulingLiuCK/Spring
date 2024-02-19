package com.lck.entity;/***
#Create by LCK on 2021/12/18  14:50
*/
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
