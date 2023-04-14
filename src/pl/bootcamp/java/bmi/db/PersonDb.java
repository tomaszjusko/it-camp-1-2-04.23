package pl.bootcamp.java.bmi.db;

import pl.bootcamp.java.bmi.person.Person;

import java.util.Random;

public class PersonDb {
    Person[] people = new Person[100];

    public PersonDb() {
        for(int j = 0; j<people.length;j++) {
            this.people[j] = new Person(0, new Random().nextInt(1000, 10000));
        }
    }


    public void setNewPerson(int i, String nickname, int height, int weight) {
        this.people[i].setNickname(nickname);
        this.people[i].setHeight(height);
        this.people[i].setWeight(weight);
    }

    public void calculateBmi(int i){

        this.people[i].setBmi(this.people[i].getWeight() / Math.pow(((double)this.people[i].getHeight()/100), 2));

    }

    public int returnPin(int i){
        return this.people[i].getPin();
    }
    public String returnNickName(int i){
        return this.people[i].getNickname();
    }

    public void analyzeBmi(int i){
        System.out.println("Hello " + this.people[i].getNickname() + " your BMI is: " + Math.round(this.people[i].getBmi()*100.0)/100.0);
        if (this.people[i].getBmi() < 18.5){
            System.out.println("Underweight");
        } else if (this.people[i].getBmi() < 25) {
            System.out.println("Healthy Weight");
        } else if (this.people[i].getBmi() < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity - damn... dude!");
        }
    }
    public int findPinIndex(int pin){
        int index = -1;
        for (int i = 0; i<this.people.length; i++){
            if (this.people[i].getPin() == pin){
                index=i;
                break;
            }

        }
        return index;
    }

}

