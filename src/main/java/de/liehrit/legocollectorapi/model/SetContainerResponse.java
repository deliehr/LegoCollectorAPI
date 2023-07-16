package de.liehrit.legocollectorapi.model;

public class SetContainerResponse {
    int list_id;
    int quantity;
    boolean include_spares;
    SetResponse set;

    public SetContainerResponse() {
    }

    public int getList_id() {
        return list_id;
    }

    public void setList_id(int list_id) {
        this.list_id = list_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isInclude_spares() {
        return include_spares;
    }

    public void setInclude_spares(boolean include_spares) {
        this.include_spares = include_spares;
    }

    public SetResponse getSet() {
        return set;
    }

    public void setSet(SetResponse set) {
        this.set = set;
    }
}
