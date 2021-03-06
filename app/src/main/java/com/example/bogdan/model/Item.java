package com.example.bogdan.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Item {


    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    private int quantity;
    private double price;
    private byte[] image;

    public Item(byte[] image, String title, String description, double price, int quantity) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public byte[] getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
