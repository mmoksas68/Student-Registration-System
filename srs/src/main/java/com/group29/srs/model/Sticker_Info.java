package com.group29.srs.model;

public class Sticker_Info {
    Long sticker_id;
    String plate_no;
    String start_date;
    String end_date;
    String car_type;
    int isActive = 1;

    public Sticker_Info(Long sticker_id, String plate_no, String start_date, String end_date, String car_type) {
        this.sticker_id = sticker_id;
        this.plate_no = plate_no;
        this.start_date = start_date;
        this.end_date = end_date;
        this.car_type = car_type;
    }

    public Sticker_Info() {
    }

    public Long getSticker_id() {
        return sticker_id;
    }

    public void setSticker_id(Long sticker_id) {
        this.sticker_id = sticker_id;
    }

    public String getPlate_no() {
        return plate_no;
    }

    public void setPlate_no(String plate_no) {
        this.plate_no = plate_no;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Sticker_Info{" +
                "sticker_id=" + sticker_id +
                ", plate_no='" + plate_no + '\'' +
                ", start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", car_type='" + car_type + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
