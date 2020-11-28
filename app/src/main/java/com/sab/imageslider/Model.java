package com.sab.imageslider;

public class Model {
    private int Images;
    private String Texts;

    public Model(int images, String texts) {
        Images = images;
        Texts = texts;
    }

    public int getImages() {
        return Images;
    }

    public void setImages(int images) {
        Images = images;
    }

    public String getTexts() {
        return Texts;
    }

    public void setTexts(String texts) {
        Texts = texts;
    }
}
