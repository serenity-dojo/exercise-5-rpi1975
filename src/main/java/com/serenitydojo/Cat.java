package com.serenitydojo;

public class Cat extends Pet {
    private String favoriteToy;

    public static final String DOG_NOISE = "Meow";

    public Cat(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    @Override
    String play() {
        return "plays with " + this.favoriteToy.toLowerCase();
    }
}
