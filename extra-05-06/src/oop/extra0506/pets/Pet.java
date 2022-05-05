package oop.extra0506.pets;

import oop.extra0506.date.MyDate;
import oop.extra0506.utils.Taxonomy;
import oop.extra0506.utils.Util;

import java.util.ArrayList;

public class Pet {
    public static int numPets;
    public ArrayList<String> diseases;
    private int petID;
    private Taxonomy taxonomy;
    private boolean healthy;
    private final MyDate birthDate;
    private String petName;
    //private String diseases;
    private double currentWeight;
    public Pet(MyDate myDate,String petName,double currentWeight){
        this.birthDate = myDate;
        this.petName = petName;
        this.currentWeight = currentWeight;
        this.diseases = new ArrayList<>();
        this.petID = ++numPets;
        this.healthy = true;
    }
    /*
    public String speak(){
        //kiegesziteni
        //each pet can speak
    }
    public void unexpectedIllnessOccurred(){

    }
    public void checkHealthStatus(){

    }
    public void healing(){

    }
    public static int getNumPets(){

    }

     */

   // @Override
    /*
    public String toString() {
        return "Pet{" +
                "diseases=" + diseases +
                ", petID=" + petID +
                ", taxonomy=" + taxonomy +
                ", healthy=" + healthy +
                ", birthDate=" + birthDate +
                ", petName='" + petName + '\'' +
                ", currentWeight=" + currentWeight +
                '}';
    }
    */
}