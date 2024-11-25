package Productv4;

import Productv4.Product;

import java.text.NumberFormat;

public class Music extends Product {

    private String Artist;
    private String code;
    private String description;
    private double price;
    protected static int count = 0;

    public Music() {
        description = "";
        code = "";
        Artist = "";
        price = 0.0;
        count++;
    }

    public void setArtist(String artist)
    {
        this.Artist = artist;
    }

    public String getArtist() {
        return Artist;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString() {
        return description + " by " + Artist;
    }

    public static int getCount() {
        return count;
    }
}

