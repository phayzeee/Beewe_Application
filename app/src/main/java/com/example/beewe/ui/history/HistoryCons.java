package com.example.beewe.ui.history;

public class HistoryCons {
    private String text_z, text_x, text_c, textv;

    public HistoryCons(String text_z, String text_x, String text_c, String textv) {
        this.text_z = text_z;
        this.text_x = text_x;
        this.text_c = text_c;
        this.textv = textv;
    }

    public String getText_z() {
        return text_z;
    }

    public void setText_z(String text_z) {
        this.text_z = text_z;
    }

    public String getText_x() {
        return text_x;
    }

    public void setText_x(String text_x) {
        this.text_x = text_x;
    }

    public String getText_c() {
        return text_c;
    }

    public void setText_c(String text_c) {
        this.text_c = text_c;
    }

    public String getTextv() {
        return textv;
    }

    public void setTextv(String textv) {
        this.textv = textv;
    }
}
