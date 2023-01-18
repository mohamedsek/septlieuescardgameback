package com.septlieues.interview.models;

public class CartModel {

    private String name;
    private Integer ordinalNameValue;
    private String color;
    private Integer ordinalColorValue;

    public CartModel() {
    }

    public CartModel(String name, Integer ordinalNameValue, String color, Integer ordinalColorValue) {
        this.name = name;
        this.ordinalNameValue = ordinalNameValue;
        this.color = color;
        this.ordinalColorValue = ordinalColorValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrdinalNameValue() {
        return ordinalNameValue;
    }

    public void setOrdinalNameValue(Integer ordinalNameValue) {
        this.ordinalNameValue = ordinalNameValue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getOrdinalColorValue() {
        return ordinalColorValue;
    }

    public void setOrdinalColorValue(Integer ordinalColorValue) {
        this.ordinalColorValue = ordinalColorValue;
    }
}
