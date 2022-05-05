package oop.extra0506.utils;

import oop.extra0506.pets.Cat;

public enum CatBreed {
    Polydactyl,
    Snowshoe,
    Calico,
    BritishShorthair("British Shorthair"), // calls constructor with value
    Siamese,
    JapaneseBobtail("Japanese Bobtail"),
    Persian,
    ScottishFold("Scotthish Fold"),
    GrayTabby("Gray Tabby");
    private final String value;
    private CatBreed(String value){
        this.value = value;
    }


}
