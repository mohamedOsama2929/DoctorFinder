package com.applet.doctorfinder.doctorfinder;

/**
 * Created by doyde on 10/12/2017.
 */

public class reviewpost {
    String title;
    String descri;
    String img;
    String date;
    public reviewpost(){
    };
    public reviewpost(String title, String descri, String img, String date) {
        this.title = title;
        this.descri = descri;
        this.img = img;
        this.date=date;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
