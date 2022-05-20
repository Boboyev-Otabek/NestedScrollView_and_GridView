package com.example.a4b_6m_3java.model;

public class Member {
    private String ism;
    private String familiya;

    public Member(String ism, String familiya){
        this.ism=ism;
        this.familiya=familiya;
    }

    public String getIsm() {
        return ism;
    }

    public String getFamiliya() {
        return familiya;
    }
}
