package model;

import java.io.Serializable;

public class Bill implements Serializable {
    private long oldIndex;
    private long newIndex;
    private Customers customers;

    public Bill() {
    }

    public Bill(long oldIndex, long newIndex, Customers customers) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.customers = customers;
    }

    public long getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(long oldIndex) {
        this.oldIndex = oldIndex;
    }

    public long getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(long newIndex) {
        this.newIndex = newIndex;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                ", customers=" + customers +
                '}';
    }
}
