package com.example.recyclerview29032022;

import java.util.Date;
import java.util.List;

public class Foodmedoel {
    private String name;
    private String address;
    private  int image;
    private  float  distance;
    private List<Catalogy> CatalogyList;
    private String discount;
    private Date opentime;
    private Date closetime;
    public void Foodmedel(int image, int address, int name ){
        String address1 = this.address;
        this.image
        String name1 = this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCatalogyList(List<Catalogy> catalogyList) {
        CatalogyList = catalogyList;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Date getOpentime() {
        return opentime;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getDistance() {
        return distance;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public List<Catalogy> getCatalogyList() {
        return CatalogyList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOpentime(Date opentime) {
        this.opentime = opentime;
    }

    public String getDiscount() {
        return discount;
    }

}
