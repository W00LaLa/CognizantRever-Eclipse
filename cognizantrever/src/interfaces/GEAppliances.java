package interfaces;

public class GEAppliances implements ISwitchBoardListener{

    public void switchOne() {
        System.out.println("GE fan is on");
    }

    public void switchTwo() {
        System.out.println("GE light is on");

    }

    public void switchThree() {
        System.out.println("GE AC is on");
    }
}