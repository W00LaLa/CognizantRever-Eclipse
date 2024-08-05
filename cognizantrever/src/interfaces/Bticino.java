package interfaces;

public class Bticino implements ISwitchBoardListener{

    public void switchOne() {
        System.out.println("Biticino fan is on");

    }

    public void switchTwo() {
        System.out.println("Biticino light is on");

    }

    public void switchThree() {
        System.out.println("Biticino AC is on");
    }
}