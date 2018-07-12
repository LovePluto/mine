package com.wyh.myBatis;

import java.io.Serializable;
import java.util.List;

public class MemberLoginExceptionCriteria implements Serializable {

    private List<Long> mids;
    private String address;


    public MemberLoginExceptionCriteria() {
    }

    public List<Long> getMids() {
        return mids;
    }

    public void setMids(List<Long> mids) {
        this.mids = mids;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
