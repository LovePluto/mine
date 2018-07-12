package com.wyh.myBatis;

/**
 * 异常登录信息
 */
public class MemberLoginExceptionTo {
    private Long id;
    private Long mid;
    private String name;
    private String imei;
    private String address;
    private String udid;

    public MemberLoginExceptionTo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberLoginExceptionTo{" +
                "id=" + id +
                ", mid=" + mid +
                ", name='" + name + '\'' +
                ", imei='" + imei + '\'' +
                ", address='" + address + '\'' +
                ", udid='" + udid + '\'' +
                '}';
    }
}
