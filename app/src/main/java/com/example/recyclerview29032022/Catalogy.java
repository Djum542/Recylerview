package com.example.recyclerview29032022;

public enum Catalogy {
    RETAURENT("Nha hang"),
    FAMILY("Gia dinh"),
    BIRTHDAY("Sinh nhat"),
    PARTY("Tiec"),
    SHOP_ONILINE("Cua hang truc tuyen");
    private  String text;
    Catalogy(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
}
