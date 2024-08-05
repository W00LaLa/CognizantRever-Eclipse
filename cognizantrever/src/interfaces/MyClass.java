package interfaces;

public class MyClass {

    public static void main(String[] args) {
       // System.out.println("hello world");
        ISwitchBoardListener isbl = new Bticino();
                //GEAppliances();  ///wiring
       //me/caller clicking the switches
        isbl.switchOne();
        isbl.switchTwo();
        isbl.switchThree();
    }
}