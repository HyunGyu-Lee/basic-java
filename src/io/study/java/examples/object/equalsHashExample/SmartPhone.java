package io.study.java.examples.object.equalsHashExample;

import java.util.Objects;

public class SmartPhone {
    private String userName;
    private String phoneNumber;

    public SmartPhone(String userName, String phoneNumber){
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }


    public boolean equals(Object o) {
        if (o instanceof SmartPhone) {
            SmartPhone smartPhone = (SmartPhone) o;
            if(this.userName == smartPhone.userName){
                return true;
            }
        }
        return false;

    }

    public int hashCode() {
        return Objects.hash(userName);
    }
}
