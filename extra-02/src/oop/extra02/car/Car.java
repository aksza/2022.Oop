package oop.extra02.car;

public class Car {
    //variables
    private String carType;
    private int numberOfKilometers;
    private int yearOfManifacture;
    private String carBrand;
    private int maxPassenger;
    private int speed;
    private Color color;
    private FuelType fuelType;

    //constructors
    public Car(String carType, String carBrand, Color color, FuelType fuelType, int numberOfKilometers, int maxPassenger, int yearOfManifacture){
        this.carType = carType;
        this.carBrand = carBrand;
        this.color = color;
        this.fuelType = fuelType;
        this.numberOfKilometers = numberOfKilometers;
        this.maxPassenger = maxPassenger;
        this.yearOfManifacture = yearOfManifacture;
    }
    public Car(String carType, String carBrand, int fuelType, boolean maxPassenger, int yearOfManifacture){
        this.carType = carType;
        this.carBrand = carBrand;
        switch (fuelType){
            case 0:
                this.fuelType = FuelType.DIESEL;
                break;
            case 1:
                this.fuelType = FuelType.PETROL;
                break;
            case 2:
                this.fuelType = FuelType.GAS;
                break;
            case 3:
                this.fuelType = FuelType.ELECTRIC;
                break;
            default:
                this.fuelType = FuelType.HYBRID;
                break;
        }
        if(maxPassenger) this.maxPassenger = 5;
        else this.maxPassenger = 2;
        this.yearOfManifacture = yearOfManifacture;
        speed = 0;
        numberOfKilometers = 0;
        if(carBrand.charAt(0) == 'R') this.color = Color.RED;
        else if(carBrand.charAt(0) == 'G') this.color = Color.GREEN;
            else if(carBrand.charAt(0) == 'B') this.color = Color.BLUE;
                else if(carBrand.charAt(0) == 'W') this.color = Color.WHITE;
                    else this.color = Color.BLACK;
    }
    //getters:
    public int getNumberOfKilometers(){
        return numberOfKilometers;
    }
    public String getCarType(){
        return carType;
    }
    public int getSpeed(){
        return speed;
    }
    public FuelType getFuelType(){
        return fuelType;
    }
    public Color getColor(){
        return color;
    }
    public int getMaxPassenger(){
        return maxPassenger;
    }
    public String getCarBrand(){
        return carBrand;
    }
    public int getYearOfManifacture(){
        return yearOfManifacture;
    }
    //setter
    public void setColor(Color color){
        this.color = color;
    }
    //methods
    public void changeSpeed(int speedIndicator){
        if(speed + speedIndicator >= 0) {
            speed += speedIndicator;
        }
        else speed = 0;
    }
    public void moveCar(int kilometers){
        if(kilometers < 0){
            System.out.println("Invalid travelled kilometers");
        }
        else{
            numberOfKilometers += kilometers;
        }
    }
    public void resetMileage(){
        if(numberOfKilometers >= 200) numberOfKilometers = 0;
    }

    @Override
    public String toString(){
        String print = this.carBrand;
        print += " ";
        print += this.carType;
        if(this.maxPassenger > 2) print += " family car manufactured in ";
        else print += " two-seater car manufactured in ";
        print += this.yearOfManifacture;
        print += ".\nProperties:\n\tCOLOR: ";
        print += this.color;
        print += "\n\tFUEL: ";
        print += this.fuelType;
        print += "\n\tKMs traveled: ";
        print += numberOfKilometers;
        return print;
    }
}
