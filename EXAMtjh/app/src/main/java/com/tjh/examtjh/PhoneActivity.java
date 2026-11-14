package com.tjh.examtjh;

public class PhoneActivity {
    private int imgId; //图片资源id
    private String phoneName;
    private String price;

    public PhoneActivity(int imgId, String phoneName, String price) {
        this.imgId = imgId;
        this.phoneName = phoneName;
        this.price = price;
    }

    public int getImgId() {
        return imgId;
    }
    public String getPhoneName() {
        return phoneName;
    }
    public String getPrice() {
        return price;
    }
}

