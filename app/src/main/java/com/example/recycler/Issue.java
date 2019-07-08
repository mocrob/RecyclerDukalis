package com.example.recycler;

public class Issue {
    private String name;
    private String shortDesk;
    private String fullDesk;
    private int imageResource;
    private int price;

    public Issue(String name, String shortDesk, String fullDesk, int imageResource, int price) {
        this.name = name;
        this.shortDesk = shortDesk;
        this.fullDesk = fullDesk;
        this.imageResource = imageResource;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getShortDesk() {
        return shortDesk;
    }

    public String getFullDesk() {
        return fullDesk;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getPrice() {
        return price;
    }
}
