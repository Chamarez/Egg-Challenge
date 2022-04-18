package Egg.Challenge.challenge.orders.payloads;

import Egg.Challenge.challenge.orders.models.Order;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class OrderRequest {
    @NotBlank
    private String username;
    @NotBlank

    private String address;
    @NotBlank

    private Date ord_date;
    @NotBlank

    private String state;
    @NotBlank

    private String desc;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOrd_date() {
        return ord_date;
    }

    public void setOrd_date(Date ord_date) {
        this.ord_date = ord_date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }




}
