package day46_encapsulation;

public class Car {
    private String model; //private is an access modifier. When variable is private, it can be accessed only in the same class.
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel){
        model = carModel;
    }
    //getter method for model
    public String getModel(){
        return model;
    }

    //setter for year
    public void setYear(int year){
        this.year = year;
    }
    //getter for year
    public int getYear(){
        return year;
    }

    //setter for mileage
    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    //getter for mileage
    public int getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}


