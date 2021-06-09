package com.example.beewe.ui.offer;

public class OfferCons {
    private String text_a, text_b, btn_a, text_c, text_d;
    private int image;

    public OfferCons(String text_a, String text_b, String btn_a, String text_c, String text_d, int image) {
        this.text_a = text_a;
        this.text_b = text_b;
        this.btn_a = btn_a;
        this.text_c = text_c;
        this.text_d = text_d;
        this.image = image;
    }

    public String getText_a() {
        return text_a;
    }

    public void setText_a(String text_a) {
        this.text_a = text_a;
    }

    public String getText_b() {
        return text_b;
    }

    public void setText_b(String text_b) {
        this.text_b = text_b;
    }

    public String getBtn_a() {
        return btn_a;
    }

    public void setBtn_a(String btn_a) {
        this.btn_a = btn_a;
    }

    public String getText_c() {
        return text_c;
    }

    public void setText_c(String text_c) {
        this.text_c = text_c;
    }

    public String getText_d() {
        return text_d;
    }

    public void setText_d(String text_d) {
        this.text_d = text_d;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
