package com.company;

import java.math.BigDecimal;

public class Car {
    private String type;
    private String name;
    private String code;
    private BigDecimal km_state;
    private Integer seats;

    public Car(String type, String name, String code, BigDecimal km_state, Integer seats) {
        this.type = type;
        this.name = name;
        this.code = code;
        this.km_state = km_state;
        this.seats = seats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getKm_state() {
        return km_state;
    }

    public void setKm_state(BigDecimal km_state) {
        this.km_state = km_state;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
