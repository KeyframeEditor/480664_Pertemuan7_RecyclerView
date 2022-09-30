package com.example.myapplication;

public class Animal {
    String name;
    String type;
    String desc;

    public Animal(String name, String type, String desc) {
        this.name = name;
        this.type = type;
        this.desc = desc;
    }

    // NAMES

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // COLOR

    public String getColor() {
        return type;
    }

    public void setColor(String color) {
        this.type = color;
    }

    // DESC
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}