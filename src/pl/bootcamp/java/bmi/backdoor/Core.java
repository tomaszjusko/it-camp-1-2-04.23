package pl.bootcamp.java.bmi.backdoor;


import pl.bootcamp.java.bmi.db.PersonDb;

public class Core {
    Gui gui = new Gui();
    int i = 0;
    boolean run = true;
    PersonDb personDb = new PersonDb();
    public void start(){
        do {

            switch (gui.showMenu()) {
                case "1":
                    personDb.setNewPerson(i, gui.inputNickname(), gui.inputHeight(), gui.inputWeight());
                    personDb.calculateBmi(i);
                    personDb.analyzeBmi(i);
                    System.out.println("Your unique PIN to check BMI is: " + personDb.returnPin(i));
                    i++;
                    break;
                case "2":
                    personDb.analyzeBmi(personDb.findPinIndex(gui.inputPin()));
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    System.out.println("Wrong command");
                    break;
            }
        } while (run);
    }
}
