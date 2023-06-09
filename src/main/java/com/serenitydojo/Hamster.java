package com.serenitydojo;

public class Hamster extends Pet {
    private String favoriteGame;

    public static final String HAMSTER_NOISE = "Squeak";

    public Hamster(String name, String favoriteGame, int age) {
        super(name, age);
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    // Exercise 4
    public String makeNoise() {return HAMSTER_NOISE;}

    @Override
    String play() {
        return "runs in " + this.favoriteGame.toLowerCase();
    }
}
