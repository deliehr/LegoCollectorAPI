package de.liehrit.legocollectorapi.model;

import java.util.List;

public class SetsResponse {
    int count;
    int next;
    int previous;
    List<SetContainerResponse> results;

    public SetsResponse() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getPrevious() {
        return previous;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    public List<SetContainerResponse> getResults() {
        return results;
    }

    public void setResults(List<SetContainerResponse> results) {
        this.results = results;
    }
}