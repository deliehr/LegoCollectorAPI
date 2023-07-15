package de.liehrit.legocollectorapi.model;

import java.util.List;

public class LegoResponse {
    int count;
    List<LegoSet> sets;

    public LegoResponse() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<LegoSet> getSets() {
        return sets;
    }

    public void setSets(List<LegoSet> sets) {
        this.sets = sets;
    }
}