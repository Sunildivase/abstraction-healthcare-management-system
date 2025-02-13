package com.abstractionhealthcaremanagement.model;

import java.util.Objects;

public class Billing {

    private int billId;
    private int bill;
    private int totalBill;
    private int personId;

    @Override
    public String toString() {
        return "Billing{" +
                "billId=" + billId +
                ", bill=" + bill +
                ", totalBill=" + totalBill +
                ", personId=" + personId +
                '}';
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Billing billing = (Billing) o;
        return getBillId() == billing.getBillId() && getBill() == billing.getBill() && getTotalBill() == billing.getTotalBill() && getPersonId() == billing.getPersonId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBillId(), getBill(), getTotalBill(), getPersonId());
    }
}
