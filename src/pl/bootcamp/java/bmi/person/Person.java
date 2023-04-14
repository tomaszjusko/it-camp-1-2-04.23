package pl.bootcamp.java.bmi.person;

public class Person {
    private String nickname;
    private int height;
    private int weight;
    private double bmi;
    private int pin;


    public Person(double bmi, int pin) {
        this.bmi = bmi;
        this.pin = pin;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getNickname() {
        return nickname;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }

    public int getPin() {
        return pin;
    }
}
