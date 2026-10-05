package org.example.Components;

public class Address {
    private String flatNo;
    private String streetNo;
    private String landmark;
    private String city;
    private String district;
    private String state;
    private long pinCode;

    public Address(String flatNo, String streetNo, String landmark, String city, String district, String state, long pinCode) {
        this.flatNo = flatNo;
        this.streetNo = streetNo;
        this.landmark = landmark;
        this.city = city;
        this.district = district;
        this.state = state;
        this.pinCode = pinCode;
    }

    public Address(String flatNo, String streetNo,  String city, String district, String state, long pinCode) {
        this.flatNo = flatNo;
        this.streetNo = streetNo;
        this.city = city;
        this.district = district;
        this.state = state;
        this.pinCode = pinCode;
    }



    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address:\n" +
                "Flat Number: " + flatNo +
                ", Street Number: " + streetNo +
                ",\nLandmark: " + landmark +
                ",\nCity: " + city +
                ", District: " + district +
                ",\nState: " + state +
                ", Pin code: " + pinCode + "\n";
    }
}
