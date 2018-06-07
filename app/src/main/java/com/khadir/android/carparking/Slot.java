package com.khadir.android.carparking;

public class Slot {
    private String name, carnumber, phone, time;
    private boolean available = false;

    public Slot(String name, String carnumber, String phone, String time, boolean available) {
        this.name = name;
        this.carnumber = carnumber;
        this.phone = phone;
        this.time = time;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getTime() {
        return time;
    }

    public boolean isAvailable() {
        return available;
    }
}
