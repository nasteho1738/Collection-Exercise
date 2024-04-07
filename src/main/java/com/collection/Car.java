package com.collection;
import java.util.HashMap;
import java.util.Map;

public class Car {
    private int id;
    private String brand;
    private String model;


    public Car(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void ex12 (){
        Map<Integer, Car> cars = new HashMap<>();
        cars.put(1, new Car(1, "Ford", " Camaro"));
        cars.put(2, new Car(2, "Toyota", "Mustang"));
        cars.put(3, new Car(3, "Chevrolet", " Civic"));

        for (Car car : cars.values()) {
            if ("Ford" .equals(car.getBrand())) {
                System.out.println("It is a Ford: " + car.getModel());
            }
        }
    }
}
