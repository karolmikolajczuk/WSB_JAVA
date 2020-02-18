package com.company;

public class Phone {
    private Integer number;
    private String net;
    private Integer dialling_code;

    public Phone(Integer number, String net) {
        this.number = number;
        this.net = net;
        this.dialling_code = -1;
    }

    public Phone(Integer number, String net, Integer dialling_code) {
        this.number = number;
        this.net = net;
        this.dialling_code = dialling_code;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public Integer getDialling_code() {
        return dialling_code;
    }

    public void setDialling_code(Integer dialling_code) {
        this.dialling_code = dialling_code;
    }
}
