package com.alexsimo.domain.entity;

import com.google.common.base.MoreObjects;

public class Address {
    private String zipCode;
    private String latitude;
    private String longitude;
    private String country;
    private String streetAddress;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("zipCode", zipCode)
                .add("latitude", latitude)
                .add("longitude", longitude)
                .add("country", country)
                .add("streetAddress", streetAddress)
                .toString();
        /*return "Address{" +
                "zipCode='" + zipCode + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", country='" + country + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                '}';*/
    }
}
