package de.liehrit.legocollectorapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetResponse {

    String set_num;
    String name;
    int year;
    int theme_id;
    int num_parts;
    String set_img_url;
    String set_url;
    String last_modified_dt;

    public SetResponse() {
    }

    public String getNumber() {
        return set_num;
    }

    public void setSet_num(String set_num) {
        this.set_num = set_num;
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

    public void setTheme_id(int theme_id) {
        this.theme_id = theme_id;
    }

    public int getPartsCount() {
        return num_parts;
    }

    public void setNum_parts(int num_parts) {
        this.num_parts = num_parts;
    }

    public String getImageUrl() {
        return set_img_url;
    }

    public void setSet_img_url(String set_img_url) {
        this.set_img_url = set_img_url;
    }

    public String getSetUrl() {
        return set_url;
    }

    public void setSet_url(String set_url) {
        this.set_url = set_url;
    }

    public String getLastModifiedDate() {
        return last_modified_dt;
    }

    public void setLast_modified_dt(String last_modified_dt) {
        this.last_modified_dt = last_modified_dt;
    }
}
