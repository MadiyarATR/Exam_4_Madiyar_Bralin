package application.entities;

import java.util.List;

public class SpaceStation {
    private final int id;
    private final String name;
    private final int attitude;
    private int power;
    private int status;
    private int communication;
    private int age;
    private final String country;
    private List<String> information;

    public SpaceStation(int id, String name, int attitude, int power, int status, int communication, int age, String country){
        this.id = id;
        this.name = name;
        this.attitude = attitude;
        this.power = power;
        this.status = status;
        this.communication = communication;
        this.age = age;
        this.country = country;
        this.information = information;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAttitude() {
        return attitude;
    }

    public int getPower() {
        return power;
    }

    public int getStatus() {
        return status;
    }

    public int getCommunication() {
        return communication;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public List<String> getInformation() {
        return information;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public void setInformation(List<String> information) {
        this.information = information;
    }
}