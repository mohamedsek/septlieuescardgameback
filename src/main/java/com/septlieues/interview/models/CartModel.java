package com.septlieues.interview.models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartModel cartModel = (CartModel) o;
        return Objects.equals(name, cartModel.name) && Objects.equals(color, cartModel.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
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
