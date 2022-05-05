package oop.extra0506.utils;

public enum DogBreed {
    LabradorRetrievers("Labrador Retrievers"), //calls constructor with its value
    GermanShepherds("German Shepherds"),
    GoldenRetrievers("Golden Retrievers"),
    FrenchBulldogs("French Bulldogs"),
    Bulldogs,
    Beagles,
    Poodles;
    private final String value;
    private DogBreed(String value){
        this.value = value;
    }

}
