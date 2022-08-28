package model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private long identityCard;
    private String birthDay;

    public Customer(String name, long identityCard, String birthDay) {
        this.name = name;
        this.identityCard = identityCard;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(long identityCard) {
        this.identityCard = identityCard;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", cmnd=" + identityCard +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
