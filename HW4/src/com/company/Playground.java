package com.company;

public class Playground {
    private int pricePerHour,rating=0;
    private String Location;
    private boolean bookedStatus=false;
    private boolean isApproved=false;
    private boolean valid;
    private boolean isDeleted = false;

    public Playground(int PPH, String location) {
        pricePerHour = PPH;
        Location = location;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public String getLocation() {
        return Location;
    }

    public boolean isBooked() {
        return bookedStatus;
    }

    public int getRating() {
        return rating;
    }

    public void setBookedStatus(boolean bookedStatus) {
        this.bookedStatus = bookedStatus;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
