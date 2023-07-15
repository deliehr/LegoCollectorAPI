package de.liehrit.legocollectorapi.model;

public class LegoSet {
    String number;
    String name;
    int year;
    int countParts;
    String imageUrl;
    String setUrl;

    public LegoSet() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountParts() {
        return countParts;
    }

    public void setCountParts(int countParts) {
        this.countParts = countParts;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSetUrl() {
        return setUrl;
    }

    public void setSetUrl(String setUrl) {
        this.setUrl = setUrl;
    }
}
